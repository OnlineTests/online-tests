package edu.onlinetests.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;


public class FileUtils {

	public static List<String> getAllLinesFromFile(String filename) {
		InputStream input = FileUtils.class.getResourceAsStream(filename);
		try {
			return IOUtils.readLines(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ArrayList<String>();
	}
	
}
