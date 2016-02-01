package edu.onlinetests.utils;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FileUtilsTester {

	@Test
	public void testGetAllLinesFromFile() {
		List<String> result = FileUtils.getAllLinesFromFile("/credentials.properties");
		Assert.assertEquals(3, result.size());
		Assert.assertTrue(result.get(0).contains("user"));
		Assert.assertTrue(result.get(1).contains("password"));
		Assert.assertTrue(result.get(2).contains("url"));
	}
	
}
