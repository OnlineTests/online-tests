package edu.onlinetests.backend.validator;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.exception.ServerException;
import edu.onlinetests.model.User;

@Aspect
@Component
public class ValidatorAspect {

	@Before("execution(* *(edu.onlinetests.model.User,..)) && @annotation(edu.onlinetests.backend.validator.annotation.Validate)")
	public void validateUser(JoinPoint point) throws Throwable {
		User userParameter = (User)point.getArgs()[0];
		List<String> errors = UserValidator.validate(userParameter);
		if(!errors.isEmpty()) {
			throw new ServerException("User is not valid!", errors);
		}
	}
	
}
