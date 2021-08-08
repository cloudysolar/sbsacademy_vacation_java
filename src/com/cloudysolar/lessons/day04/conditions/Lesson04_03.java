package com.cloudysolar.lessons.day04.conditions;

public class Lesson04_03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		if (num1 < num2) {
			System.out.println(num1 + "(이)가 " + num2 + "보다 작습니다!");
		}
		else if (num1 == num2) {
			System.out.println(num1 + "(이)가 " + num2 + "와 같습니다!");
		}
		else {
			System.out.println(num1 + "(이)가 " + num2 + "보다 큽니다!");
		}
	}
}
