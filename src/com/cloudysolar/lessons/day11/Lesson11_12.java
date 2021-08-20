package com.cloudysolar.lessons.day11;

import java.util.Scanner;

public class Lesson11_12 {
	public int divide(int num1, int num2) throws ArithmeticException {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("감히 0으로 나눠?!");
		}
		else {
			return num1 / num2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lesson11_12 inst = new Lesson11_12();

		String input = sc.nextLine();

		int num1 = Integer.parseInt(input.split(" ")[0]);
		int num2 = Integer.parseInt(input.split(" ")[1]);

		try {
			inst.divide(num1, num2);
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생하였습니다! 사유: " + e.getMessage());
		}
	}
}
