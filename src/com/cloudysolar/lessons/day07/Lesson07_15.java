package com.cloudysolar.lessons.day07;

// 두 수를 매개변수로 받아 두 수의 합계를 반환하는 메소드를 만들어 실행해봅시다.

import java.util.Scanner;

public class Lesson07_15 {
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Lesson07_15 inst = new Lesson07_15();
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		sc.nextLine();
		int num2 = sc.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + inst.add(num1, num2));
	}
}
