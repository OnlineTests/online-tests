package edu.onlinetests.persistance;

import org.springframework.stereotype.Repository;

import edu.onlinetests.model.User;

@Repository
public interface UserDAO {

	String login(String username, String password);
	User register(User user);
	
}
