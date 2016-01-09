package edu.onlinetests.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import edu.onlinetests.model.Gender;
import edu.onlinetests.model.User;
import edu.onlinetests.model.builder.UserBuilder;
import edu.onlinetests.service.UserService;
import edu.onlinetests.view.Pages;

@ManagedBean(name = "registerController")
@RequestScoped
public class RegisterController {

	@ManagedProperty(value = "#{sessionController}")
	private SessionController sessionController;
	
	@ManagedProperty(value = "#{userService}")
	private UserService userService;
	
	private String age;
	private String email;
	private String gender;
	private String name;
	private String password;
	private String username;
	
	public String register() {
		User user = UserBuilder.getBuilder()
			.setAge(Integer.parseInt(age))
			.setEmail(email)
			.setGender(gender)
			.setName(name)
			.setUsername(username)
			.setPassword(password)
			.build();
		userService.register(user);
		return Pages.MAIN_PAGE;
	}
	
	public String backToLogin() {
		return Pages.LOGIN_PAGE;
	}
	
	public SessionController getSessionController() {
		return sessionController;
	}
	public void setSessionController(SessionController session) {
		this.sessionController = session;
	}

	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
