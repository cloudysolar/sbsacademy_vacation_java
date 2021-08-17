package com.cloudysolar.lessons.day09.examples.example3;

public class Lesson09_03 {
	public static void main(String[] args) {
		Lesson09_03 inst = new Lesson09_03();

		Computer cpu = new Computer();

		Keyboard kb = new Keyboard();
		Mouse ms = new Mouse();
		Headset hs = new Headset();
		Monitor mn = new Monitor();

		cpu.setPower(true);

		cpu.connectDevice(kb);
		cpu.connectDevice(ms);
		cpu.connectDevice(hs);
		cpu.connectDevice(mn);

		cpu.setPower(false);
	}
}
