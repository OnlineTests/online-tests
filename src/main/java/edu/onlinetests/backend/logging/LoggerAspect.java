package edu.onlinetests.backend.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.User;
import edu.onlinetests.utils.SessionUtils;

@Aspect
@Component
public class LoggerAspect {

	private static String LOGOUT_ACTION = "has logged out";
	private static String LOGIN_ACTION = "has logged in";
	private static String REGISTER_ACTION = "has registered in";
	private static String FAILED_ACTION = "failed to authenticate";
	
	private String getUserInformation(User user, String action) {
		return String.format("User %s %s", user.getUsername(), action);
	}
	
	@Around("@annotation(Loggable)")
	public Object logUserChanges(ProceedingJoinPoint point) throws Throwable {
		String methodName = point.getSignature().getName();
		if(methodName.equals("logout")) {
			User user = SessionUtils.getSessionUser();
			point.proceed();
			Logger.log(getUserInformation(user, LOGOUT_ACTION));
		} else if(methodName.equals("register")) {
			Object returnValue = point.proceed();
			if(returnValue != null) {
				Logger.log(getUserInformation((User)returnValue, REGISTER_ACTION));
				return returnValue;
			}
		} else if(methodName.equals("login")) {
			String username = (String)point.getArgs()[0];
			Object returnValue = point.proceed();
			if(returnValue != null) {
				Logger.log(getUserInformation((User) returnValue, LOGIN_ACTION));
				return returnValue;
			} else {
				Logger.log("User " + username + " " + FAILED_ACTION);
			}
		}
		return null;
	}
	
}
