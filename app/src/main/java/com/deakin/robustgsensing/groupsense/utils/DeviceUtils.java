package com.deakin.robustgsensing.groupsense.utils;

import android.content.Context;
import android.provider.Settings.Secure;

import com.deakin.robustgsensing.groupsense.Globals;


public class DeviceUtils {

	
	public static String getDeviceName(Context mContext) {

		String id = (Secure.getString(mContext.getContentResolver(),
				Secure.ANDROID_ID));
		Globals.getInstance().setDeviceID(id);
		if (id.equalsIgnoreCase("f8f9dd3274ce3acd"))
		{
			Globals.getInstance().setDeviceName("S2");
			return "S2";
		}
		if (id.equalsIgnoreCase("5e3a96dfee99a4cc"))
		{
			Globals.getInstance().setDeviceName("Nexus4");
			return "Nexus4";
		}
		if (id.equalsIgnoreCase("2b806fb4814726fd"))
		{
			Globals.getInstance().setDeviceName("Nexus7");
			return "Nexus7";
		}
		if (id.equalsIgnoreCase("9933c935c74dc344"))
		{
			Globals.getInstance().setDeviceName("Tablet_1");
			return "Tablet_1";
		}
		if (id.equalsIgnoreCase("e08539a7074f2db8"))
		{
			Globals.getInstance().setDeviceName("Tablet_2");
			return "Tablet_2";
		}
		if (id.equalsIgnoreCase("909b9e82cb51c833"))
		{
			Globals.getInstance().setDeviceName("Tablet_3");
		return "Tablet_3";
		}
		if (id.equalsIgnoreCase("8e3f89745178b63f"))
		{
			Globals.getInstance().setDeviceName("Tablet_4");
			return "Tablet_4";
		}
		if (id.equalsIgnoreCase("84c9a78309e65af0"))
		{
			Globals.getInstance().setDeviceName("Tablet_5");
			return "Tablet_5";
		}
		Globals.getInstance().setDeviceName("unknown");
		return "unknonw";
	}

	
}
