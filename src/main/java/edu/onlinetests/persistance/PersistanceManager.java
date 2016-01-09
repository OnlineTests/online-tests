package edu.onlinetests.persistance;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import edu.onlinetests.utils.PropertiesProvider;

@Scope("singleton")
@Service
public class PersistanceManager {
	
	  private static final String CREDENTIALS_PATH = "credentials.properties";
	  private EntityManagerFactory emFactory;

	  @PostConstruct
	  private void initialize() {
		  Map<String, String> credentials = PropertiesProvider.propertiesToMap(PropertiesProvider.getPropertiesFromFile(CREDENTIALS_PATH));
		  emFactory = Persistence.createEntityManagerFactory("online_tests", credentials);
	  }
	  
	  public EntityManager getEntityManager() {
		  return emFactory.createEntityManager();
	  }

	  public void close() {
		  emFactory.close();
	  }
}
