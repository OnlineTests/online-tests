package edu.onlinetests.backend.persistence.jpadao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.persistence.CategoryDAO;
import edu.onlinetests.backend.persistence.PersistanceManager;
import edu.onlinetests.model.Category;

@Component
public class JPACategoryDAO implements CategoryDAO {

	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPACategoryDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	@Override
	public List<Category> getCategories()  {
		EntityManager em = persistanceManager.getEntityManager();
		TypedQuery<Category> query = em.createNamedQuery("Category.findAll", Category.class);
	    List<Category> results = query.getResultList();
	    em.close();
		return results;
	}
}
