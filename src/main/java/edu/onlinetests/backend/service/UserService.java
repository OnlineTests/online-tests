package edu.onlinetests.backend.service;

import org.springframework.stereotype.Service;

import edu.onlinetests.backend.validator.annotation.Validate;
import edu.onlinetests.model.User;

@Service(value = "userService")
public interface UserService {

	User login(String username, String password);

	@Validate
	User register(User user);
	User getCurrentUser();
	
}
