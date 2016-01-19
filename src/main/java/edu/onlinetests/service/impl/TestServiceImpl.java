package edu.onlinetests.service.impl;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;
import edu.onlinetests.persistance.TestDAO;
import edu.onlinetests.service.TestService;
import edu.onlinetests.service.UserService;

@Component
public class TestServiceImpl implements TestService {

	private TestDAO testDAO;
	private UserService userService;
	
	@Autowired
	public TestServiceImpl(TestDAO testDAO, UserService userService) {
		this.testDAO = testDAO;
		this.userService = userService;
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

	@Override
	public int evaluateTest(Map<Question, String> answersForQuestions,
			Category categoryForTest) {
		int correctAnswers = 0;
		for (Entry<Question,String> entry : answersForQuestions.entrySet()) {
			if(entry.getKey().getCorrectAnswer().equals(entry.getValue())) {
				correctAnswers++;
			}
		}
		return correctAnswers;
	}

}
