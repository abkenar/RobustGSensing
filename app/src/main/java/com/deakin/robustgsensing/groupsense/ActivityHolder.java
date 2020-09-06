package com.deakin.robustgsensing.groupsense;

import android.app.Application;

public class ActivityHolder extends Application {
	
	private String currentActivity = "";

	public String getCurrentActivity() {
		return this.currentActivity;
	}

	public void setCurrentActivity(String str) {
		this.currentActivity = str;
	}

}
