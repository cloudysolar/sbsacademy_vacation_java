package com.cloudysolar.lessons.day09.examples.example1;

public class TV {
	String model = "";
	int size;
	int nowChannel = 0;
	boolean isPowerOn = false;

	public TV(String model, int inch) {
		this.model = model;
		this.size = inch;
	}

	public void setPower(boolean powerSwitch) {
		isPowerOn = powerSwitch;
	}

	public void changeChannel(int channelNum) {
		nowChannel = channelNum;
	}
}
