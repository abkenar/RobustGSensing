package com.deakin.robustgsensing.groupsense;

import android.util.Log;

public class Init {

	public Init() {
		
		Log.d("amin", "Application is working in Simulation Mode ...");
		// Set false if you want to run app in actual mode
		Globals.getInstance().setSimOn(false);
		
		
		
	}

}
