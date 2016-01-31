package edu.onlinetests.backend.persistence.jpadao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.persistence.PersistanceManager;
import edu.onlinetests.backend.persistence.UserDAO;
import edu.onlinetests.model.User;

@Component
public class JPAUserDAO implements UserDAO {

	private static final String LOGIN_SQL = "select u from User u where u.username=:username and password=:password";
	
	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPAUserDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	@Override
	public User login(String username, String password)  {
		EntityManager em = persistanceManager.getEntityManager();
		Query query = (Query) em.createQuery(LOGIN_SQL);
		query.setParameter("username", username);
		query.setParameter("password", password);
		try {
			return (User) query.getSingleResult();
		} catch(NoResultException exception) {
			return null;
		} finally {
			em.close();
		}
	}

	@Override
	public User register(User user) {
		EntityManager em = persistanceManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		return user;
	}

}
