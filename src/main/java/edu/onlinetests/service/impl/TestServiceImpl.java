package edu.onlinetests.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;
import edu.onlinetests.persistance.TestDAO;
import edu.onlinetests.service.TestService;

@Component
public class TestServiceImpl implements TestService {

	private TestDAO testDAO;
	
	@Autowired
	public TestServiceImpl(TestDAO testDAO) {
		this.testDAO = testDAO;
	}
	
	@Override
	public void storeTestResult(TestResult testResult) {
		testDAO.storeTestResult(testResult);
		
	}

	@Override
	public Set<TestResult> getBestResultsOfCategory(Category category) {
		return testDAO.getBestResultsOfCategory(category);
	}

	@Override
	public Set<TestResult> getOwnResults(User user) {
		return testDAO.getOwnResults(user);
	}

}
