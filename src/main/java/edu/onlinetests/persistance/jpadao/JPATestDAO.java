package edu.onlinetests.persistance.jpadao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;
import edu.onlinetests.persistance.PersistanceManager;
import edu.onlinetests.persistance.TestDAO;


@Component
public class JPATestDAO implements TestDAO {

	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPATestDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	private EntityManager currentEntityManager() {
		return persistanceManager.getEntityManager();
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
		Query query = currentEntityManager().createQuery("select s from TestResult s where s.category=:category order by s.score");
		query.setParameter("category",category); 
		query.setMaxResults(10);
		List<TestResult> result = query.getResultList();
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TestResult> getOwnResults(User user) {
		Query query = currentEntityManager().createQuery("select s from TestResult s where s.user=:user order by s.score");
		query.setParameter("user",user); 
		
		List<TestResult> result = query.getResultList();
		return result;
		
	}

	

}
