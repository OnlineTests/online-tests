package edu.onlinetests.persistance.jpadao;

import org.springframework.stereotype.Component;

import edu.onlinetests.model.User;
import edu.onlinetests.model.builder.UserBuilder;
import edu.onlinetests.persistance.UserDAO;

@Component
public class JPAUserDAO implements UserDAO {

	@Override
	public User login(String username, String password)  {
		return UserBuilder.getBuilder()
				.setUsername(username)
				.setPassword(password)
				.build();
	}

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
