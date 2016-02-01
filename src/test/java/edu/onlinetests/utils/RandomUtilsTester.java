package edu.onlinetests.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RandomUtilsTester {
	
	@Test
	public void testGenerateInteger() {
		int upperBound = 10;
		int result = RandomUtils.generateInteger(upperBound);
		assertTrue(result >= 0 && result < upperBound);
	}

}
