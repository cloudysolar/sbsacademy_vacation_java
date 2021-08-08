package com.cloudysolar.lessons.day04.conditions;

// 문제 1 : 조건문을 이용해 입력한 숫자가 짝수인지 홀수인지를 판별해봅시다.

import java.util.Scanner;

public class Lesson04_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("입력된 숫자 " + number + "(은)는 짝수입니다.");
		}
		else {
			System.out.println("입력된 숫자 " + number + "(은)는 홀수입니다.");
		}
	}
}
