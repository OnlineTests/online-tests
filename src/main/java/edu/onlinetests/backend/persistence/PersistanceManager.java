package edu.onlinetests.backend.persistence;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import edu.onlinetests.utils.PropertiesProvider;
import edu.onlinetests.utils.StringKey;

@Scope("singleton")
@Service
public class PersistanceManager {
	
	  private static final String PERSISTENCE_UNIT = "online_tests";
	  private EntityManagerFactory emFactory;
	  private Properties credentials;

	  @PostConstruct
	  public void initialize() {
		  credentials = PropertiesProvider.getPropertiesFromFile(PropertiesProvider.getStringResource(StringKey.CREDENTIALS_PATH));
		  emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT, PropertiesProvider.propertiesToMap(credentials));
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
