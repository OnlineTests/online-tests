package edu.onlinetests.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.persistance.QuestionDAO;
import edu.onlinetests.persistance.QuestionStatisticDAO;
import edu.onlinetests.service.QuestionService;

@Component
public class QuestionServiceImpl implements QuestionService {

	private QuestionDAO questionDAO;
	
	@Autowired
	public QuestionServiceImpl(QuestionDAO questionDAO, QuestionStatisticDAO questionStatisticDAO) {
		this.questionDAO = questionDAO;
	}
	@Override
	public List<Question> getQuestionsOfCategory(Category category) {
		return questionDAO.getQuestionsOfCategory(category);
	}
}
