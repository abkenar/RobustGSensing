package com.deakin.robustgsensing.honeybeeframework.worker;

import tnefern.honeybeeframework.common.Job;


public interface JobsReceived {
	public void onJobRecieved(Job jobReceived);
	public void onJobRecieved();
}
