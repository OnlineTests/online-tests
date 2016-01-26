package edu.onlinetests.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

@Service(value = "testService")
public interface TestService {

	void storeTestResult(TestResult testResult);
	List<TestResult> getBestResultsOfCategory(Category category);
	List<TestResult> getOwnResults(User user);
	int evaluateTest(Map<Question, String> answersForQuestions, Category categoryForTest);
	
}
