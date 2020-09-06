/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.Utils;

/**
 *
 * @author abakhshandehabk
 */
import java.text.ParseException;
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

    public static String getDateByTimestamp(long time, boolean ms) {
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(time);
        Date date = cal.getTime();
        //String date = DateFormat.format("yyyy-MM-dd HH:mm:ss.SSS", cal).toString();
        //String date = DateFormat.format("yyyy-MM-dd HH:mm:ss:SSS", cal).toString();
        SimpleDateFormat dateFormat;
        if (ms) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        } else {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }

        String strDate = dateFormat.format(date);

        return strDate;
    }

    public static int getSecDifference(String dateTime1, String dateTime2) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date parsedDate1 = dateFormat.parse(dateTime1);
        Date parsedDate2 = dateFormat.parse(dateTime2);

        long diffMillSec = parsedDate2.getTime() - parsedDate1.getTime();

        int totalSec = 0;
        
        return (int)(diffMillSec/1000);

//        long diffSeconds = diffMillSec / 1000 % 60;
//        long diffMinutes = diffMillSec / (60 * 1000) % 60;
//        long diffHours = diffMillSec / (60 * 60 * 1000) % 24;
//        long diffDays = diffMillSec / (24 * 60 * 60 * 1000);
//
//        if (diffMillSec == 0) {
//            return 0;
//        } else {
//            if (diffSeconds != 0) {
//
//                if (diffMinutes != 0) {
//
//                    if (diffHours != 0) {
//                        totalSec = (int) diffSeconds + (int) diffMinutes * 60 + (int) diffMinutes * 3600;
//                    } else {
//                        totalSec = (int) diffSeconds + (int) diffMinutes * 60;
//                    }
//
//                } else {
//                    totalSec = (int) diffSeconds;
//                }
//
//            } else {
//                totalSec = 0;
//            }
//
//        }
//        return totalSec;
    }
    
    
    
        public static int getSecDifference(long dateTime1, long dateTime2) throws ParseException {

        long diffMillSec = dateTime2 - dateTime1;

        return (int)(diffMillSec/1000);

    }

    public static long getTimeStampByTimeDate(String DateTime, boolean millisecond) throws ParseException {

        SimpleDateFormat dateFormat;
        if (millisecond) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        } else {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }

        Date parsedDate = dateFormat.parse(DateTime);
        return parsedDate.getTime();

    }

}
