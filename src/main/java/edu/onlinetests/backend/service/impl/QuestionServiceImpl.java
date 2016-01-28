package edu.onlinetests.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.persistence.QuestionDAO;
import edu.onlinetests.backend.persistence.QuestionStatisticDAO;
import edu.onlinetests.backend.service.QuestionService;
import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;

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
