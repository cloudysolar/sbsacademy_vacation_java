package com.cloudysolar.lessons.day10.polymorphism.interfaces;

public class Keyboard implements InputDevice {
	String name = "키보드";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return type;
	}
}
