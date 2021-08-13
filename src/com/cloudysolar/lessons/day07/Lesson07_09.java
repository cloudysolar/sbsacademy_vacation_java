package com.cloudysolar.lessons.day07;

import java.util.Scanner;

public class Lesson07_09 {
	public int getGCD(int num1, int num2) {
		int gcd = 0;

		while(num2 > 0) {
			gcd = num1 % num2;
			num1 = num2;
			num2 = gcd;
		}

		return num1;
	}

	public static void main(String[] args) {
		Lesson07_09 inst = new Lesson07_09();
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		sc.nextLine();
		int num2 = sc.nextInt();

		System.out.println(num1 + "(와)과 " + num2 + "의 최대공약수는 " + inst.getGCD(num1, num2) + "입니다.");
	}
}
