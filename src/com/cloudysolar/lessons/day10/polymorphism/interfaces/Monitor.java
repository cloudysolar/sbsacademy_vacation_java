package com.cloudysolar.lessons.day10.polymorphism.interfaces;

public class Monitor implements OutputDevice {
	String name = "모니터";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return type;
	}
}
