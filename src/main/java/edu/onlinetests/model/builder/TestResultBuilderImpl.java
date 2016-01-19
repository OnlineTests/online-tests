package edu.onlinetests.model.builder;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

final class TestResultBuilderImpl extends TestResultBuilder {

	private TestResult testResult = new TestResult();
	
	@Override
	public TestResultBuilder setScore(int score) {
		testResult.setScore(score);
		return this;
	}

	@Override
	public TestResultBuilder setUser(User user) {
		testResult.setUser(user);
		return this;
	}

	@Override
	public TestResultBuilder setCategory(Category category) {
		testResult.setCategory(category);
		return this;
	}

	@Override
	public TestResult build() {
		return testResult;
	}

}
