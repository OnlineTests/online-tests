package edu.onlinetests.backend.service.impl;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.logging.Loggable;
import edu.onlinetests.backend.persistence.UserDAO;
import edu.onlinetests.backend.service.UserService;
import edu.onlinetests.backend.validator.annotation.Validate;
import edu.onlinetests.model.User;

@Component
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	private User user;
	

	@Autowired
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Loggable
	@Override
	public User login(String username, String password) {
		user = userDAO.login(username, password);
		return user;
	}

	@Loggable
	@Validate
	@Override
	public User register(User user) {
		this.user = userDAO.register(user);
		return user;
	}

	@Loggable
	@Override
	public void logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	}
}
