package com.cloudysolar.lessons.day07;

public class Lesson07_10 {
	public void showMessage(String message) {
		System.out.println(message);
	}

	public void showMessage(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		Lesson07_10 inst = new Lesson07_10();

		inst.showMessage("Message");
		inst.showMessage(100);
	}
}
