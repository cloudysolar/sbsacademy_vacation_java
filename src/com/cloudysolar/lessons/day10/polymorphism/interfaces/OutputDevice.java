package com.cloudysolar.lessons.day10.polymorphism.interfaces;

public interface OutputDevice extends Device {
	String type = "출력장치";

	String getType();
}
