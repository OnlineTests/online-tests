package edu.onlinetests.backend.persistence;

import org.junit.Before;

import edu.onlinetests.AllTests;
import edu.onlinetests.backend.persistence.jpadao.JPATestDAO;

public class TestDAOTester {

	private TestDAO testDAO;
	
	@Before
	public void init() {
		testDAO = new JPATestDAO(AllTests.persistanceManager);
	}
	
}
