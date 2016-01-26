package edu.onlinetests.backend.persistance;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

@Repository
public interface TestDAO {

	void storeTestResult(TestResult testResult);
	List<TestResult> getBestResultsOfCategory(Category category);
	List<TestResult> getOwnResults(User user);
	
}
