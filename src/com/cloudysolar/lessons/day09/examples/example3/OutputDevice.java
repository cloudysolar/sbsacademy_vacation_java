package com.cloudysolar.lessons.day09.examples.example3;

public interface OutputDevice extends Devices {
	String type = "출력장치";

	default String getType() {
		return type;
	}

	String getName();
}
