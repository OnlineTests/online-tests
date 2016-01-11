package edu.onlinetests.persistance.jpadao;


import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.QuestionStatistic;

import edu.onlinetests.persistance.PersistanceManager;

import edu.onlinetests.persistance.QuestionStatisticDAO;

@Component
public class JPAQuestionStatisticDAO implements QuestionStatisticDAO {

	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPAQuestionStatisticDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	@Override
	public void storeQuestionStatistics(
			List<QuestionStatistic> questionStatistics) {
		
	}

	@Override
	public Map<Question, QuestionStatistic> getQuestionStatisticsOfCategory(
			Category category) {
		return null;
		//Map<Question, QuestionStatistic> questionStatisticOfCategories =   (Map<Question, QuestionStatistic>) currentEntityManager().createQuery("select qs from QuestionStatistic qs where qs.category=:category");
		//return questionStatisticOfCategories;
	}

	

}
