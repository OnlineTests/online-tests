package edu.onlinetests.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import edu.onlinetests.model.User;
import edu.onlinetests.view.Pages;

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
	
	public String logout() {
		//FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/../login?faces-redirect=true";
	}
	
}
