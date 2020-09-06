package com.deakin.robustgsensing.groupsense;

public class Globals {
	private static Globals instance;

	// Global variable
	private String myAtomicActivity;
	private boolean readyToSend;
	private boolean longEnough;
	private float distance;
	private String classifierTimeStamp;
	private String deviceID;
	private String deviceName;
	private String serverName;
	private float deviceDirection;
	private int deviceMode;
	private boolean simMode; 
	private Double latitude;
	private Double longitude;
	private boolean serverFound;
	

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	

	public boolean isSimMode() {
		return simMode;
	}

	public void setSimOn(boolean simMode) {
		this.simMode = simMode;
	}

	public int getDeviceMode() {
		return deviceMode;
	}

	public void setDeviceMode(int deviceMode) {
		this.deviceMode = deviceMode;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public float getDeviceDirection() {
		return deviceDirection;
	}

	public void setDeviceDirection(float deviceDirection) {
		this.deviceDirection = deviceDirection;
	}

	public String getClassfierTimeStamp() {
		return classifierTimeStamp;
	}

	public void setClassifierTimeStamp(String timeStamp) {
		this.classifierTimeStamp = timeStamp;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	// Restrict the constructor from being instantiated
	private Globals() {
		readyToSend=false;
	}

	public void setMyAtomicActivity(String data) {
		this.myAtomicActivity = data;
	}

	public String getMyAtomicActivity() {
		return this.myAtomicActivity;
	}

	public boolean getIsReadyToSend() {
		return readyToSend;
	}

	public void setReadyToSend(boolean readyToSend) {
		this.readyToSend = readyToSend;
	}

	public static synchronized Globals getInstance() {
		if (instance == null) {
			instance = new Globals();
		}
		return instance;
	}

	public boolean getLongEnough() {
		return longEnough;
	}

	public void setLongEnough(boolean longEnough) {
		this.longEnough = longEnough;
	}
	
	public void resetMyInfo()
	{
		this.myAtomicActivity="";
		this.readyToSend=false;
		this.classifierTimeStamp="";
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public boolean isServerFound() {
		return serverFound;
	}

	public void setServerFound(boolean serverFound) {
		this.serverFound = serverFound;
	}
}