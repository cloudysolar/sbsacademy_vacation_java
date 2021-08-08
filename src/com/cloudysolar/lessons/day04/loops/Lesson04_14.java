package com.cloudysolar.lessons.day04.loops;

// 문제 1 : 반복문을 이용해 1부터 입력받은 수까지의 합을 구해봅시다.

import java.util.Scanner;

public class Lesson04_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int input = sc.nextInt();

		for (int i = 0; i <= input; i++) {
			sum += i;
		}

		System.out.println("1부터 " + input + "까지의 합은 " + sum + "입니다.");
	}
}
