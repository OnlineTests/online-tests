package edu.onlinetests.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.QuestionStatistic;

@Service(value = "questionService")
public interface QuestionService {

	List<Question> getQuestionsOfCategory(Category category);
	Map<Question, QuestionStatistic> getQuestionStatisticsOfCategory(Category category);
	
}
