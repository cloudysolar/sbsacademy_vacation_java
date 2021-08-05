package com.cloudysolar.lessons.day03;

// 산술 연산자 : +, -, *, /, %

public class Lesson03_02 {
	public static void main(String[] args) {
		int result = 10 + 4 * 3;
		double sum = 1.72 * 4.87 - 3;

		int totalResult = (int)(result / sum);

		System.out.println("result = " + result);
		System.out.println("sum = " + sum);
		System.out.println("totalResult = " + totalResult);
	}
}
