package edu.onlinetests.backend.persistance;

import org.springframework.stereotype.Repository;

import edu.onlinetests.model.QuestionStatistic;

@Repository
public interface QuestionStatisticDAO {

	void storeQuestionStatistic(QuestionStatistic questionStatistics);
	
}
