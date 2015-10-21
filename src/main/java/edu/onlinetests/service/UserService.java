package edu.onlinetests.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.onlinetests.dao.UserDAO;

@Service(value = "userService")
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public String login() {
		return userDAO.login();
	}
}
