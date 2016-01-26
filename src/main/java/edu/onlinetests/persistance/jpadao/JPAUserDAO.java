package edu.onlinetests.persistance.jpadao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.User;
import edu.onlinetests.persistance.PersistanceManager;
import edu.onlinetests.persistance.UserDAO;

@Component
public class JPAUserDAO implements UserDAO {

	private PersistanceManager persistanceManager;
	
	@Autowired
	public JPAUserDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}
	
	private EntityManager currentEntityManager() {
		return persistanceManager.getEntityManager();
	}

	@Override
	public User login(String username, String password)  {
		Query query = (Query) currentEntityManager().createQuery("select u from User u where u.username=:username and password=:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		try {
			return (User) query.getSingleResult();
		} catch(NoResultException exception) {
			return null;
		}
	}

	@Override
	public User register(User user) {
		currentEntityManager().persist(user);
		return user;
	}

}
