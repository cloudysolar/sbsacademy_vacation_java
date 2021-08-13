package com.cloudysolar.lessons.day07;

import java.util.Scanner;

public class Lesson07_11 {
	public int factorial(int number) {
		if (number <= 1) {
			return number;
		}
		else {
			return factorial(number - 1) * number;
		}
	}

	public static void main(String[] args) {
		Lesson07_11 inst = new Lesson07_11();
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		System.out.println(number + "! = " + inst.factorial(number));
	}
}
