package edu.onlinetests.service;

import java.util.Map;
import java.util.SortedSet;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

public interface TestService {

	void storeTestResult(TestResult testResult);
	SortedSet<TestResult> getBestResultsOfCategory(Category category);
	SortedSet<TestResult> getOwnResults(User user);
	TestResult evaluateTest(Map<Question, String> answersForQuestions, Category categoryForTest);
	
}
