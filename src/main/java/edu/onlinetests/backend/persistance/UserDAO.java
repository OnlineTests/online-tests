package edu.onlinetests.backend.persistance;

import org.springframework.stereotype.Repository;

import edu.onlinetests.model.User;

@Repository
public interface UserDAO {

	User login(String username, String password);
	User register(User user);
	
}
