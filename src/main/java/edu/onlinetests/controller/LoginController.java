package edu.onlinetests.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import edu.onlinetests.model.User;
import edu.onlinetests.service.UserService;
import edu.onlinetests.view.Pages;

@ManagedBean(name = "loginController")
@RequestScoped
public class LoginController {

	@ManagedProperty(value = "#{userService}")
	private UserService userService;
	@ManagedProperty(value = "#{sessionController}")
	private SessionController sessionController;

	private String username;
	private String password;
	
	public String login() {
		User user = new User();
		user.setUsername(username);
		sessionController.setUser(user);
		return Pages.MAIN_PAGE;
	}

	public String initiateRegister() {
		return Pages.REGISTER_PAGE;
	}

	public void setUserService(UserService loginService) {
		this.userService = loginService;
	}
	public UserService getUserService() {
		return userService;
	}

	public SessionController getSessionController() {
		return sessionController;
	}
	public void setSessionController(SessionController session) {
		this.sessionController = session;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
