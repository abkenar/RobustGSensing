package com.deakin.robustgsensing.groupsense.utils;

import com.mpc.latrobe.eecsar.constants.Constants;

import java.util.ArrayList;
import java.util.List;

public class MessageParser {

	public static List<String> decodeMessage(String msg) {
		List<String> decodedMsg = new ArrayList<String>();
		String delimiter = "-";
		String[] temp = msg.split(delimiter);

		if (!Constants.USING_GPS) {

			for (int i = 0; i < 4; i++) {
				decodedMsg.add(temp[i]);
			}

		} else {
			for (int i = 0; i < 6; i++) {
				decodedMsg.add(temp[i]);
			}
		}

		return decodedMsg;
	}

	public static List<String> decodeMessageGPS(String msg) {
		List<String> decodedMsg = new ArrayList<String>();
		String delimiter = "-";
		String[] temp = msg.split(delimiter);
		for (int i = 0; i < 6; i++) {
			decodedMsg.add(temp[i]);
		}
		return decodedMsg;
	}

	public static String encodeMessage(String deviceName, String activity,
                                       String timeStampt) {
		String encodedMsg = deviceName + "-" + activity + "-" + timeStampt;
		return encodedMsg;
	}

	public static String encodeMessage(String deviceName, String activity,
                                       float deviceDirection, String timeStampt) {
		String encodedMsg = deviceName + "-" + activity + "-"
				+ String.valueOf(deviceDirection) + "-" + timeStampt;
		return encodedMsg;
	}

	public static String encodeMessage(String deviceName, String activity,
                                       float deviceDirection, Double lat, Double lon, String timeStampt) {
		String encodedMsg = deviceName + "-" + activity + "-"
				+ String.valueOf(deviceDirection) + "-" + String.valueOf(lat)
				+ "-" + String.valueOf(lon) + "-" + timeStampt;
		return encodedMsg;
	}

}
