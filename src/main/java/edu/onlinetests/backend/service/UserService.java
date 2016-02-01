package edu.onlinetests.backend.service;

import org.springframework.stereotype.Service;

import edu.onlinetests.backend.exception.ServerException;
import edu.onlinetests.model.User;

@Service(value = "userService")
public interface UserService {

	User login(String username, String password) throws ServerException;
	User register(User user) throws ServerException;
	void logout();
}
