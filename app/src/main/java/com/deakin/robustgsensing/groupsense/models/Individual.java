package com.deakin.robustgsensing.groupsense.models;


public class Individual {

	private Long key;
	private String deviceID;
	private String deviceName;
	private String atomicActivity;
	private float direction;
	private Long timeStamp;
	private String dateTime;
	private Double latitude;
	private Double longitude;
	private Double altitude;

	public Individual(String deviceName, String atomicActivity, float direction , String dateTime)
	{
		this.deviceName=deviceName;
		this.atomicActivity=atomicActivity;
		this.direction=direction;
		this.dateTime=dateTime;
	}
	
	
	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public float getDirection() {
		return direction;
	}

	public void setDirection(float direction) {
		this.direction = direction;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getAtomicActivity() {
		return atomicActivity;
	}

	public void setAtomicActivity(String atomicActivity) {
		this.atomicActivity = atomicActivity;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

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

	public Double getAltitude() {
		return altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

}
