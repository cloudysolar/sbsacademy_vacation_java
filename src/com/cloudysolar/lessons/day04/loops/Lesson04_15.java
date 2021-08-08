package com.cloudysolar.lessons.day04.loops;

// 문제 2 : 숫자를 입력받고 해당 숫자의 구구단을 1부터 9까지 출력해봅시다.

import java.util.Scanner;

public class Lesson04_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(input + " X " + i + " = " + (input * i));
		}
	}
}
