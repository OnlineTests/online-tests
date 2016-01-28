package edu.onlinetests.backend.persistence.jpadao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.persistence.PersistanceManager;
import edu.onlinetests.backend.persistence.TestDAO;
import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;


@Component
public class JPATestDAO implements TestDAO {

	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPATestDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	@Override
	public void storeTestResult(TestResult testResult) {
		EntityManager em = persistanceManager.getEntityManager();
		if (testResult!=null){
			em.getTransaction().begin();
			em.persist(testResult);
			em.getTransaction().commit();
		}
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TestResult> getBestResultsOfCategory(Category category) {
		EntityManager em = persistanceManager.getEntityManager();
		Query query = em.createQuery("select s from TestResult s where s.category=:category order by s.score desc");
		query.setMaxResults(10);
		query.setParameter("category",category); 
		List<TestResult> list = query.getResultList();
		em.close();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TestResult> getOwnResults(User user) {
		EntityManager em = persistanceManager.getEntityManager();
		Query query = em.createQuery("select s from TestResult s where s.user=:user order by s.score desc");
		query.setParameter("user",user); 
		List<TestResult> list = query.getResultList();
		em.close();
		return list;
	}
}
