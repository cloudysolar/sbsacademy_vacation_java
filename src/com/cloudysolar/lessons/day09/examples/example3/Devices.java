package com.cloudysolar.lessons.day09.examples.example3;

public interface Devices {
	String type = "주변장치";

	default String getType() {
		return type;
	}

	String getName();
}
