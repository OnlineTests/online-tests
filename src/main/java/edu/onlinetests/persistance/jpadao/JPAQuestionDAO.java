package edu.onlinetests.persistance.jpadao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.persistance.PersistanceManager;
import edu.onlinetests.persistance.QuestionDAO;

@Component
public class JPAQuestionDAO implements QuestionDAO {

	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPAQuestionDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	private EntityManager currentEntityManager() {
		return persistanceManager.getEntityManager();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Question> getQuestionsOfCategory(Category category) {
		Query query = currentEntityManager().createQuery("select q from Question q where q.category=:category");
		query.setParameter("category", category);
		return query.getResultList();
	}

	

}
