package edu.onlinetests.backend.validator;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.exception.ServerException;
import edu.onlinetests.backend.logging.Logger;
import edu.onlinetests.model.User;

@Aspect
@Component
public class ValidatorAspect {

	@Before("execution(* *(edu.onlinetests.model.User,..)) && @annotation(edu.onlinetests.backend.validator.annotation.Validate)")
	public void validateUser(JoinPoint point) throws Throwable {
		User userParameter = (User)point.getArgs()[0];
		List<String> errors = UserValidator.validate(userParameter);
		if(!errors.isEmpty()) {
			String message = String.format("The data provided for user %s is not valid!", userParameter.getName());
			Logger.log(message);
			throw new ServerException(message, errors);
		}
	}
	
}
