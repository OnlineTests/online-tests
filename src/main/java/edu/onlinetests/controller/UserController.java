package edu.onlinetests.controller;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.User;
import edu.onlinetests.service.UserService;
import edu.onlinetests.view.Pages;

@ManagedBean(name = "userController")
@RequestScoped
@Component
public class UserController {

	@Autowired
	private UserService userService;

	private String username;
	private String password;
	
	public String login() {
		User user = null;
		if(username!=null && password!=null) {
			user = userService.login(username, password);
		}
		Map<String, Object> session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		session.put("user", user);
		return Pages.MAIN_PAGE;
	}

	public String initiateRegister() {
		return Pages.REGISTER_PAGE;
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return Pages.LOGIN_PAGE;
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
