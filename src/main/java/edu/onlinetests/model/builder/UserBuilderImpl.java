package edu.onlinetests.model.builder;

import edu.onlinetests.model.Gender;
import edu.onlinetests.model.User;

class UserBuilderImpl extends UserBuilder {

	private User user = new User();
	
	@Override
	public UserBuilder setAge(int age) {
		user.setAge(age);
		return this;
	}

	@Override
	public UserBuilder setUsername(String username) {
		user.setUsername(username);
		return this;
	}

	@Override
	public UserBuilder setPassword(String password) {
		user.setPassword(password);
		return this;
	}

	@Override
	public UserBuilder setEmail(String email) {
		user.setEmail(email);
		return this;
	}

	@Override
	public UserBuilder setName(String name) {
		user.setName(name);
		return this;
	}

	@Override
	public UserBuilder setGender(Gender gender) {
		user.setGender(gender);
		return this;
	}

	@Override
	public User build() {
		return user;
	}

}
