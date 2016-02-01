package edu.onlinetests.utils;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class PropertiesProviderTester {
	
	@Test
	public void testGetPropertiesFromFile() {
		Properties properties = PropertiesProvider.getPropertiesFromFile("credentials.properties");
		Assert.assertEquals("root", properties.getProperty("user"));
		Assert.assertEquals("", properties.getProperty("password"));
	}
	
	@Test
	public void testGetStringResource() {
		String techProperties = PropertiesProvider.getStringResource("technologiesFilePath");
		Assert.assertEquals("/technologies.txt", techProperties);
		String credentialsProperties = PropertiesProvider.getStringResource("credentialsPath");
		Assert.assertEquals("credentials.properties", credentialsProperties);
		String quizProperties = PropertiesProvider.getStringResource("questionsPerQuiz");
		Assert.assertEquals("5", quizProperties);
	}
	
}
