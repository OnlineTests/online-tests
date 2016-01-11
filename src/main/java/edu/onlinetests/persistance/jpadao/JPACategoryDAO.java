package edu.onlinetests.persistance.jpadao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.persistance.CategoryDAO;
import edu.onlinetests.persistance.PersistanceManager;

@Component
public class JPACategoryDAO implements CategoryDAO {

	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPACategoryDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	@Override
	public List<Category> getTestCategories()  {
		EntityManager em = persistanceManager.getEntityManager();
		TypedQuery<Category> query = em.createNamedQuery("Category.findAll", Category.class);
	    List<Category> results = query.getResultList();
		return results;
	}

	

}
