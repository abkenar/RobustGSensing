package com.deakin.robustgsensing.groupsense.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {

	public static String getCurrentDateTime() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formattedDate = df.format(c.getTime());
		return formattedDate;
	}
	
	public static String getCurrentTime() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		String formattedDate = df.format(c.getTime());
		return formattedDate;
	}
	
	public static String getCurrentDate() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = df.format(c.getTime());
		return formattedDate;
	}

}
