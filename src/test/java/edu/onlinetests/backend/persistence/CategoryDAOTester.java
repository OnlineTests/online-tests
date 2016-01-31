package edu.onlinetests.backend.persistence;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import edu.onlinetests.AllTests;
import edu.onlinetests.backend.persistence.jpadao.JPACategoryDAO;
import edu.onlinetests.model.Category;

public class CategoryDAOTester {

	private CategoryDAO categoryDAO;
	
	@Before
	public void init() {
		categoryDAO = new JPACategoryDAO(AllTests.persistanceManager);
	}
	
	@Test
	public void testGetCategories() {
		List<Category> categories = categoryDAO.getCategories();
		assertEquals(6, categories.size());
	}
}
