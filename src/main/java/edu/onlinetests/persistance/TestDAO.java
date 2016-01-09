package edu.onlinetests.persistance;

import java.util.SortedSet;

import org.springframework.stereotype.Repository;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

@Repository
public interface TestDAO {

	void storeTestResult(TestResult testResult);
	SortedSet<TestResult> getBestResultsOfCategory(Category category);
	SortedSet<TestResult> getOwnResults(User user);
	
}
