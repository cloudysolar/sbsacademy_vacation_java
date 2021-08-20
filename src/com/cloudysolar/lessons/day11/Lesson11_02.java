package com.cloudysolar.lessons.day11;

public class Lesson11_02 {
	public int factorial(int number) {
		return number * factorial(number - 1);
	}

	public static void main(String[] args) {
		Lesson11_02 inst = new Lesson11_02();

		// 강제로 StackOverflowError 발생시키기
		inst.factorial(10);
	}
}
