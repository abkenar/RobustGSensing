package com.deakin.robustgsensing.groupsense;

public class MobileDevice {

	private String deviceName;
	private String deviceCurrentActivity;

	public MobileDevice(String deviceName, String deviceCurrentActivity) {
		super();
		this.deviceName = deviceName;
		this.deviceCurrentActivity = deviceCurrentActivity;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceCurrentActivity() {
		return deviceCurrentActivity;
	}

	public void setDeviceCurrentActivity(String deviceCurrentActivity) {
		this.deviceCurrentActivity = deviceCurrentActivity;
	}

}
