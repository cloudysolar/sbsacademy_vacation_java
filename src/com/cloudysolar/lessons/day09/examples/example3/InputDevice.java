package com.cloudysolar.lessons.day09.examples.example3;

public interface InputDevice extends Devices {
	String type = "입력장치";

	default String getType() {
		return type;
	}

	String getName();
}
