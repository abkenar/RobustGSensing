package com.deakin.robustgsensing.groupsense;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTime {

	public static String getCurrentDateTime() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
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

	public static String getDateByTimestamp(long time) {
		Calendar cal = Calendar.getInstance(Locale.ENGLISH);
		cal.setTimeInMillis(time);
		Date date = cal.getTime();
		//String date = DateFormat.format("yyyy-MM-dd HH:mm:ss.SSS", cal).toString();
		//String date = DateFormat.format("yyyy-MM-dd HH:mm:ss:SSS", cal).toString();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

		String strDate= dateFormat.format(date);

		return strDate;

	}
}
