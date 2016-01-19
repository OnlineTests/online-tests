package edu.onlinetests.persistance.jpadao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.QuestionStatistic;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.persistance.PersistanceManager;
import edu.onlinetests.persistance.QuestionStatisticDAO;

@Component
public class JPAQuestionStatisticDAO implements QuestionStatisticDAO {

	private PersistanceManager persistanceManager;
	
	
	
	@Autowired
	public JPAQuestionStatisticDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	private EntityManager currentEntityManager() {
		return persistanceManager.getEntityManager();
	}

	
	@Override
	public void storeQuestionStatistics(
			List<QuestionStatistic> questionStatistics) {
		EntityManager em = persistanceManager.getEntityManager();
		if (questionStatistics!=null){
			em.persist(questionStatistics);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<Question, QuestionStatistic> getQuestionStatisticsOfCategory(
			Category category) {
		Query query = currentEntityManager().createQuery("select qs from QuestionStatistic qs where qs.category=:category ");
		query.setParameter("category",category); 
		
		List<QuestionStatistic> list = query.getResultList();
		
		Map<Question,QuestionStatistic> map = new HashMap<Question,QuestionStatistic>();
		for (QuestionStatistic qs : list) map.put(qs.getQuestion(), qs);
		return map;
	}

	

}
