package edu.onlinetests.model.builder;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

public abstract class TestResultBuilder {
	public static UserBuilder getBuilder() {
		return new UserBuilderImpl();
	}
	public abstract TestResultBuilder setScore(int score);
	public abstract TestResultBuilder setUser(User user);
	public abstract TestResultBuilder setCategory(Category category);
	public abstract TestResult build();
	
}
