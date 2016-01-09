package edu.onlinetests.persistance.jpadao;

import org.springframework.stereotype.Component;

import edu.onlinetests.model.User;
import edu.onlinetests.persistance.UserDAO;

@Component
public class JPAUserDAO implements UserDAO {

	@Override
	public String login(String username, String password)  {
		return "Hello Spring!";
	}

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
