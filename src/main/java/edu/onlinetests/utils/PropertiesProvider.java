package edu.onlinetests.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import edu.onlinetests.backend.persistence.PersistanceManager;

public class PropertiesProvider {

	public static final String PASSWORD_PROPERTY = "password";
	public static final String USER_PROPERTY = "user";
	public static final String URL_PROPERTY = "url";
	
	private static final Logger logger = LogManager.getLogger(PropertiesProvider.class);
	private static final Properties strings;
	
	static {
		strings = getPropertiesFromFile("strings.properties");
	}
	
	public static Properties getPropertiesFromFile(String path) {
		Properties properties = new Properties();
		try {
			URL url = PersistanceManager.class.getResource("/"+path);
			File file = new File(url.toURI());
			properties.load(new FileInputStream(file));
		} catch (IOException e) {
			logger.error("Properties file " + path + " not found!");
		} catch (URISyntaxException e) {
			logger.error("URL not an URI");
		}
		return properties;
	}
	
	public static Map<String, String> propertiesToMap(Properties properties) {
		Map<String, String> propertiesMap = new HashMap<String, String>();
		propertiesMap.put("javax.persistence.jdbc.url", properties.getProperty(URL_PROPERTY));
		propertiesMap.put("javax.persistence.jdbc.user", properties.getProperty(USER_PROPERTY));
		propertiesMap.put("javax.persistence.jdbc.password", properties.getProperty(PASSWORD_PROPERTY));
		return propertiesMap;
	}
	
	public static String getStringResource(String key) {
		return strings.getProperty(key);
	}
	
	
}
