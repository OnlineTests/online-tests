package edu.onlinetests.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.User;
import edu.onlinetests.persistance.UserDAO;
import edu.onlinetests.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	@Autowired
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public User login(String username, String password) {
		return userDAO.login(username, password);
	}

	@Override
	public User register(User user) {
		return userDAO.register(user);
	}

}
