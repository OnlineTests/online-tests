package edu.onlinetests.persistance;

import java.util.Set;

import org.springframework.stereotype.Repository;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

@Repository
public interface TestDAO {

	void storeTestResult(TestResult testResult);
	Set<TestResult> getBestResultsOfCategory(Category category);
	Set<TestResult> getOwnResults(User user);
	
}
