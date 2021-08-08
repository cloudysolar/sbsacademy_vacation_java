package com.cloudysolar.lessons.day04.loops;

// 문제 3 : 큰 숫자 하나와 그 숫자보다 작은 숫자를 입력받고 마지막에 입력받은 숫자의 배수를 첫 번째 입력받은 숫자까지 출력해봅시다.

import java.util.Scanner;

public class Lesson04_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input1 = sc.nextInt();
		int input2 = sc.nextInt();

		for (int i = 1; i <= input1; i++) {
			if (input2 * i <= input1) {
				System.out.println((input2 * i));
			}
		}
	}
}
