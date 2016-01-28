package edu.onlinetests.backend.persistence;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.onlinetests.backend.persistence.jpadao.JPAUserDAO;
import edu.onlinetests.model.User;

public class UserDAOTester {

	private static PersistanceManager persistanceManager = new PersistanceManager();
	private UserDAO userDAO;
	
	@BeforeClass
	public static void setUpPersistenceManager() {
		persistanceManager.initialize();
	}
	
	@Before
	public void init() {
		userDAO = new JPAUserDAO(persistanceManager);
	}

	@Test
	public void test() {
		User user = userDAO.login("Arnold", "12345");
		assertTrue(user.getEmail().equals("szederjesiarnold@yahoo.com"));
	}

}
