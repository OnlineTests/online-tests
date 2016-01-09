package edu.onlinetests.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.onlinetests.model.User;

@ManagedBean(name = "sessionController")
@SessionScoped
public class SessionController {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
