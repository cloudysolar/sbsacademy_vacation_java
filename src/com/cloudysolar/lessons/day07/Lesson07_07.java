package com.cloudysolar.lessons.day07;

public class Lesson07_07 {
	public void paramTest(int value) {
		System.out.println("입력된 값은 " + value + "입니다.");
	}

	public static void main(String[] args) {
		Lesson07_07 inst = new Lesson07_07();

		inst.paramTest(100);
	}
}
