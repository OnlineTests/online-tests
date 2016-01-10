package edu.onlinetests.model.builder;

import edu.onlinetests.model.User;

public abstract class UserBuilder {

	public static UserBuilder getBuilder() {
		return new UserBuilderImpl();
	}
	public abstract UserBuilder setAge(int age);
	public abstract UserBuilder setUsername(String username);
	public abstract UserBuilder setPassword(String password);
	public abstract UserBuilder setEmail(String email);
	public abstract UserBuilder setName(String name);
	public abstract UserBuilder setGender(String gender);
	public abstract User build();
	
}
