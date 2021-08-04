package com.cloudysolar.lessons.day02.variables;

public class Lesson02_19 {
	public static void main(String[] args) {
		byte num1 = 120;
		int num2 = num1;

		System.out.println("묵시적 형변환: " + num2);

		double pie1 = 3.141592;
		int pie2 = (int) pie1;

		System.out.println("명시적 형변환: " + pie2);
	}
}
