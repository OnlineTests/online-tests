package edu.onlinetests.backend.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	public static void log(String userInformation) {
		long timeInMillis = System.currentTimeMillis();
		Date time = new Date(timeInMillis);
		String timeString = new SimpleDateFormat().format(time);
		String toLog = String.format("%s : %s!", timeString, userInformation);
		System.out.println(toLog);
	}
}
