package edu.onlinetests.backend.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.exception.ServerException;
import edu.onlinetests.backend.logging.Loggable;
import edu.onlinetests.backend.persistence.UserDAO;
import edu.onlinetests.backend.service.UserService;
import edu.onlinetests.backend.validator.annotation.Validate;
import edu.onlinetests.model.User;
import edu.onlinetests.utils.SessionUtils;

@Component
@Scope(value="singleton")
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	private List<User> users = new ArrayList<>();
	

	@Autowired
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Loggable
	@Override
	public User login(String username, String password) throws ServerException {
		User user = userDAO.login(username, password);
		addToList(user);
		return user;
	}

	@Loggable
	@Validate
	@Override
	public User register(User user) throws ServerException {
		addToList(user);
		User newUser = userDAO.register(user);
		return newUser;
	}

	@Loggable
	@Override
	public void logout() {
		removeFromList(SessionUtils.getSessionUser());
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	}
	
	private void addToList(User user) throws ServerException {
		if(user == null) {
			throw new ServerException("Authentication failed! Invalid username or password!");
		}
		if(users.contains(user)) {
			throw new ServerException("User already logged in");
		}
		users.add(user);
	}
	
	private void removeFromList(User sessionUser) {
		int index = users.indexOf(sessionUser);
		users.remove(index);
	}
}
