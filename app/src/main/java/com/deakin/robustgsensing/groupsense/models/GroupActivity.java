package com.deakin.robustgsensing.groupsense.models;

import java.util.Date;

public class GroupActivity {

    private String groupActivity;
    private String startTime;
    private Date endTime;
    private String participants;
    
    public String getParticipant() {
		return participants;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	}


	public String getGroupActivity() {
		return groupActivity;
	}

	public void setGroupActivity(String groupActivity) {
		this.groupActivity = groupActivity;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


}
