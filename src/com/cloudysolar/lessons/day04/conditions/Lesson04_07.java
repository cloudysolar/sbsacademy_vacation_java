package com.cloudysolar.lessons.day04.conditions;

// 문제 3 : 숫자 2개와 산술 연산자를 입력받아 연산자에 해당하는 계산을 진행한 후 결과를 출력하는 계산기를 만들어봅시다.

import java.util.Scanner;

public class Lesson04_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;

		System.out.println("계산을 진행할 연산자부터 입력해주세요. 종료하려면 x를 입력하세요.");

		String op = sc.nextLine();

		if (op == "x") {
			System.out.println("프로그램을 종료합니다.");
		}
		else {
			System.out.println("계산을 진행할 숫자 2개를 따로 입력해주세요.");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			switch(op) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				case "%":
					result = num1 % num2;
					break;
			}

			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		}
	}
}
