package edu.onlinetests.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

@Service(value = "testService")
public interface TestService {

	void storeTestResult(TestResult testResult);
	Set<TestResult> getBestResultsOfCategory(Category category);
	Set<TestResult> getOwnResults(User user);
	
}
