package edu.onlinetests.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import edu.onlinetests.service.UserService;

@ManagedBean(name = "userBean")
@RequestScoped
public class UserBean {

	@ManagedProperty(value = "#{userService}")
	private UserService userService;

	private String username;
	private String password;
	private String result;
	
	public String getResult() {
		return result;
	}

	public String login() {
		result = userService.login();
		return "main";
	}

	public void reset() {
		username = "";
		password = "";
	}

	public void setUserService(UserService loginService) {
		this.userService = loginService;
	}
	
	public UserService getUserService() {
		return userService;
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
