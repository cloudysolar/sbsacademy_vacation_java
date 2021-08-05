package com.cloudysolar.lessons.day03;

// 문제 1 : 간단한 사칙연산을 수행하는 계산기를 만들어봅시다.

import java.util.Scanner;

public class Lesson03_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("[계산기] 계산할 첫 번째 숫자를 입력해주세요: ");
		int num1 = sc.nextInt();

		System.out.println("[계산기] 계산할 두 번째 숫자를 입력해주세요: ");
		int num2 = sc.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	}
}
