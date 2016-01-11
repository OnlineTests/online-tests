package edu.onlinetests.persistance.jpadao;

import java.util.SortedSet;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;
import edu.onlinetests.persistance.PersistanceManager;
import edu.onlinetests.persistance.TestDAO;


@Component
public class JPATestDAO implements TestDAO {

	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPATestDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	private EntityManager currentEntityManager() {
		return persistanceManager.getEntityManager();
	}

	@Override
	public void storeTestResult(TestResult testResult) {
		
	}

	@Override
	public SortedSet<TestResult> getBestResultsOfCategory(Category category) {
		return null;
	}

	@Override
	public SortedSet<TestResult> getOwnResults(User user) {
		return null;
	}

	

}
