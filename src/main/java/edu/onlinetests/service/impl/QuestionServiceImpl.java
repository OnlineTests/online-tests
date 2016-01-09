package edu.onlinetests.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.QuestionStatistic;
import edu.onlinetests.persistance.QuestionDAO;
import edu.onlinetests.persistance.QuestionStatisticDAO;
import edu.onlinetests.service.QuestionService;

//@Component
public class QuestionServiceImpl implements QuestionService {

	private QuestionDAO questionDAO;
	private QuestionStatisticDAO questionStatisticDAO;
	
	@Autowired
	public QuestionServiceImpl(QuestionDAO questionDAO, QuestionStatisticDAO questionStatisticDAO) {
		this.questionDAO = questionDAO;
		this.questionStatisticDAO = questionStatisticDAO;
	}
	@Override
	public List<Question> getQuestionsOfCategory(Category category) {
		return questionDAO.getQuestionsOfCategory(category);
	}

	@Override
	public void storeQuestionStatistics(List<QuestionStatistic> questionStatistics) {
		questionStatisticDAO.storeQuestionStatistics(questionStatistics);
		
	}

	@Override
	public Map<Question, QuestionStatistic> getQuestionStatisticsOfCategory(Category category) {
		return questionStatisticDAO.getQuestionStatisticsOfCategory(category);
	}

}
