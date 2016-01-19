package edu.onlinetests.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.User;
import edu.onlinetests.persistance.UserDAO;
import edu.onlinetests.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	private User user;
	

	@Autowired
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public User login(String username, String password) {
		user = userDAO.login(username, password);
		return user;
	}

	@Override
	public User register(User user) {
		this.user = userDAO.register(user);
		return user;
	}

	@Override
	public User getCurrentUser() {
		return user;
	}
}
