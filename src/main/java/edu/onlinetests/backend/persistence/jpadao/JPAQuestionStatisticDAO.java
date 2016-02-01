package edu.onlinetests.backend.persistence.jpadao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.persistence.PersistanceManager;
import edu.onlinetests.backend.persistence.QuestionStatisticDAO;
import edu.onlinetests.model.QuestionStatistic;

@Component
public class JPAQuestionStatisticDAO implements QuestionStatisticDAO {

	private PersistanceManager persistanceManager;

	@Autowired
	public JPAQuestionStatisticDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}

	@Override
	public void storeQuestionStatistic(QuestionStatistic questionStatistic) {
		EntityManager em = persistanceManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(questionStatistic);
		em.getTransaction().commit();
		em.close();
	}
}
