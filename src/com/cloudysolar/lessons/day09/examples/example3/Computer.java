package com.cloudysolar.lessons.day09.examples.example3;

public class Computer {
	boolean isPowerOn = false;

	public void setPower(boolean powerSwitch) {
		isPowerOn = powerSwitch;

		System.out.println("컴퓨터를 " + (isPowerOn ? "켰습니다." : "껐습니다."));
	}

	public void connectDevice(Devices devices) {
		System.out.println("주변기기 " + devices.getName() + "(이)가 " + devices.getType() + "(으)로 연결되었습니다.");
	}
}
