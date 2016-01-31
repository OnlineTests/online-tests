package edu.onlinetests.backend.persistence;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.onlinetests.AllTests;
import edu.onlinetests.backend.persistence.jpadao.JPAQuestionDAO;
import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;

public class QuestionDAOTester {

	private QuestionDAO questionDAO;
	
	@Before
	public void init() {
		questionDAO = new JPAQuestionDAO(AllTests.persistanceManager);
	}
	
	@Test
	public void testGetQuestionsOfCategory() {
		Category category = new Category();
		category.setCId(3);
		List<Question> questions = questionDAO.getQuestionsOfCategory(category);
		assertEquals(questions.size(), 16);
	}
	
}
