package com.cloudysolar.lessons.day07;

public class Lesson07_06 {
	public int returnMethod() {
		return 10;
	}

	public void notReturnMethod() {
		System.out.println("!10");
	}

	public static void main(String[] args) {
		Lesson07_06 inst = new Lesson07_06();

		System.out.println(inst.returnMethod());
		inst.notReturnMethod();
	}
}
