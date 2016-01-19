package edu.onlinetests.service;

import org.springframework.stereotype.Service;

import edu.onlinetests.model.User;

@Service(value = "userService")
public interface UserService {

	User login(String username, String password);
	User register(User user);
	User getCurrentUser();
	
}
