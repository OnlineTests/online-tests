package edu.onlinetests.backend.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.onlinetests.AllTests;
import edu.onlinetests.backend.persistence.jpadao.JPAUserDAO;
import edu.onlinetests.model.User;
import edu.onlinetests.model.builder.UserBuilder;

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
	
	@Test
	public void testRegister() {
		User user = UserBuilder.getBuilder()
				.setAge(Integer.parseInt("23"))
				.setEmail("trellageorgiana@yahoo.com")
				.setGender("F")
				.setName("Trella Georgiana")
				.setUsername("georgiana")
				.setPassword("12345")
				.build();
		User registeredUser = userDAO.register(user);
		assertTrue(registeredUser.getEmail().equals(user.getEmail()));
		assertTrue(registeredUser.getAge().equals(user.getAge()));
		assertTrue(registeredUser.getGender().equals(user.getGender()));
		assertTrue(registeredUser.getName().equals(user.getName()));
		assertTrue(registeredUser.getUsername().equals(user.getUsername()));
		assertTrue(registeredUser.getPassword().equals(user.getPassword()));
	}

}
