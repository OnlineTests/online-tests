package edu.onlinetests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import edu.onlinetests.backend.persistence.PersistanceManager;

@RunWith(Suite.class)
@SuiteClasses({
	edu.onlinetests.backend.persistence.CategoryDAOTester.class,
	edu.onlinetests.backend.persistence.QuestionDAOTester.class,
	edu.onlinetests.backend.persistence.TestDAOTester.class,
	edu.onlinetests.backend.persistence.UserDAOTester.class,
	edu.onlinetests.utils.FileUtilsTester.class,
	edu.onlinetests.utils.PropertiesProviderTester.class,
	edu.onlinetests.utils.RandomUtilsTester.class
})
public class AllTests {
	
	public static PersistanceManager persistanceManager = new PersistanceManager();
	
	@BeforeClass
	public static void setUpPersistenceManager() {
		persistanceManager.initialize();
	}
	
	@AfterClass
	public static void destroyPersistenceManager() {
		persistanceManager.close();
	}
	
}
