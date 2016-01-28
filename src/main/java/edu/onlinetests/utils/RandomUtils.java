package edu.onlinetests.utils;

import java.util.Random;

public class RandomUtils {

	public static int generateInteger(int upperBound) {
		return new Random().nextInt(upperBound);
	}
	
}
