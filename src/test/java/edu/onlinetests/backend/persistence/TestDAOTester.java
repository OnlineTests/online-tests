package edu.onlinetests.backend.persistence;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.onlinetests.AllTests;
import edu.onlinetests.backend.persistence.jpadao.JPATestDAO;
import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

public class TestDAOTester {

	private TestDAO testDAO;
	
	@Before
	public void init() {
		testDAO = new JPATestDAO(AllTests.persistanceManager);
	}
	
	@Test
	public void test() {
		Category category = new Category();
		category.setCId(6);

		User user = new User();
		user.setUserId(3);

		TestResult testResult = new TestResult();
		testResult.setUser(user);
		testResult.setScore(1);
		testResult.setCategory(category);
		
		testDAO.storeTestResult(testResult);
		
		List<TestResult> bestResults = testDAO.getBestResultsOfCategory(category);
		Assert.assertTrue(bestResults.contains(testResult));
		
		List<TestResult> ownResults = testDAO.getOwnResults(user);
		Assert.assertTrue(ownResults.contains(testResult));
	}
	
}
