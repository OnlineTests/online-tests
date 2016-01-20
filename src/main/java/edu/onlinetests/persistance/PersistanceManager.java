package edu.onlinetests.persistance;

import java.util.Properties;

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
	  private Properties credentials;

	  @PostConstruct
	  private void initialize() {
		  credentials = PropertiesProvider.getPropertiesFromFile(CREDENTIALS_PATH);
		  emFactory = Persistence.createEntityManagerFactory("online_tests", PropertiesProvider.propertiesToMap(credentials));
	  }
	  
	  public EntityManager getEntityManager() {
		  return emFactory.createEntityManager();
	  }

	  public void close() {
		  emFactory.close();
	  }
	  
	  public Properties getCredentials() {
		  return credentials;
	  }
}
