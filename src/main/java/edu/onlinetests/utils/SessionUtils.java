package edu.onlinetests.utils;

import javax.faces.context.FacesContext;

import edu.onlinetests.model.User;

public class SessionUtils {

	public static final String SESSION_USER_KEY = "user";
	
	public static User getSessionUser() {
		return (User)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(SESSION_USER_KEY);
	}
	
	public static void addUserInSession(User user) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
	}
	
}
