package com.cloudysolar.lessons.day10.polymorphism.interfaces;

public class Computer {
	boolean isPowerOn = false;

	public void connectDevice(Device device) {
		System.out.println(device.getName() + "(이)가 " + device.getType() + "(으)로 연결되었습니다.");
	}

	public void setPowerToggle() {
		isPowerOn = !isPowerOn;

		System.out.println("컴퓨터의 전원을 " + (isPowerOn ? "켰습니다." : "껐습니다."));
	}
}
