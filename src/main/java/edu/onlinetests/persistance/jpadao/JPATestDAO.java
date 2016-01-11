package edu.onlinetests.persistance.jpadao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
			em.persist(testResult);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public SortedSet<TestResult> getBestResultsOfCategory(Category category) {
		Query query = currentEntityManager().createQuery("select  s from TestResult s where s.category=:category limit 10");
		query.setParameter("category",category); 
		
		List<TestResult> list = query.getResultList();
		TreeSet <TestResult> set = (TreeSet <TestResult>) (list.isEmpty() ? new TreeSet <>() : new TreeSet <>(list));
		return set;
	}

	@SuppressWarnings("unchecked")
	@Override
	public SortedSet<TestResult> getOwnResults(User user) {
		Query query = currentEntityManager().createQuery("select  s from TestResult s where s.user=:user ");
		query.setParameter("user",user); 
		
		List<TestResult> list = query.getResultList();
		TreeSet <TestResult> set = (TreeSet <TestResult>) (list.isEmpty() ? new TreeSet <>() : new TreeSet <>(list));
		return set;
		
	}

	

}
