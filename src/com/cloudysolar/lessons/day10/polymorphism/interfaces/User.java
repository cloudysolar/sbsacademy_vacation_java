package com.cloudysolar.lessons.day10.polymorphism.interfaces;

public class User {
	public static void main(String[] args) {
		Computer computer = new Computer();

		computer.setPowerToggle();

		computer.connectDevice(new Keyboard());
		computer.connectDevice(new Monitor());
	}
}
