package edu.onlinetests.persistance;

import java.util.List;
import java.util.Map;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.QuestionStatistic;

public interface QuestionStatisticDAO {

	void storeQuestionStatistics(List<QuestionStatistic> questionStatistics);
	Map<Question, QuestionStatistic> getQuestionStatisticsOfCategory(Category category);
	
}
