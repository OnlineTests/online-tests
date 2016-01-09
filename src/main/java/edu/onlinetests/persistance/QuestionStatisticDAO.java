package edu.onlinetests.persistance;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.QuestionStatistic;

@Repository
public interface QuestionStatisticDAO {

	void storeQuestionStatistics(List<QuestionStatistic> questionStatistics);
	Map<Question, QuestionStatistic> getQuestionStatisticsOfCategory(Category category);
	
}
