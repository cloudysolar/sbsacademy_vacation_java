package com.cloudysolar.lessons.day04.loops;

// 문제 4 : 큰 숫자를 입력받고 해당 숫자의 약수는 몇개인지 찾아서 출력해봅시다.

import java.util.Scanner;

public class Lesson04_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				System.out.println(i);
			}
		}
	}
}
