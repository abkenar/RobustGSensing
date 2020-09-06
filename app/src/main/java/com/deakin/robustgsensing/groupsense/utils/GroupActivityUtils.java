package com.deakin.robustgsensing.groupsense.utils;

public class GroupActivityUtils {

	public static String getGroupActivityName(String atomicActivity) {
		
		if(atomicActivity.equalsIgnoreCase("walking"))
			return "walking together";
		if(atomicActivity.equalsIgnoreCase("running"))
			return "running together";
		if(atomicActivity.equalsIgnoreCase("inactive"))
			return "Standing together";
		if(atomicActivity.equalsIgnoreCase("cycling"))
			return "cycling together";
		return null;
	}

	
}
