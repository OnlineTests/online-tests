package edu.onlinetests.backend.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.onlinetests.AllTests;
import edu.onlinetests.backend.persistence.jpadao.JPAUserDAO;
import edu.onlinetests.model.User;

public class UserDAOTester {

	private UserDAO userDAO;
	
	@Before
	public void init() {
		userDAO = new JPAUserDAO(AllTests.persistanceManager);
	}

	@Test
	public void test() {
		String username = "Arnold";
		String password = "12345";
		User user = userDAO.login(username, password);
		assertEquals(user.getUsername(), username);
		assertEquals(user.getPassword(), password);
		assertTrue(user.getEmail().equals("szederjesiarnold@yahoo.com"));
	}

}
