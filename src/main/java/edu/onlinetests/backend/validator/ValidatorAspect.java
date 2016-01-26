package edu.onlinetests.backend.validator;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import edu.onlinetests.backend.exception.ServerException;
import edu.onlinetests.model.User;

@Aspect
public class ValidatorAspect {

	@Before("execution(* *(User)) && @annotation(Validate)")
	public Object validateUser(ProceedingJoinPoint point) throws Throwable {
		User userParameter = (User)point.getArgs()[0];
		List<String> errors = UserValidator.validate(userParameter);
		if(errors.isEmpty()) {
			return point.proceed(point.getArgs());
		} else {
			throw new ServerException("User is not valid!", errors);
		}
	}
	
}
