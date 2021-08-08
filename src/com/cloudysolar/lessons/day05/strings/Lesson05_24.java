package com.cloudysolar.lessons.day05.strings;

// 문제 3 : 문자열 2개를 입력받고 문자열 2개가 같은지 비교해봅시다.

import java.util.Scanner;

public class Lesson05_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input1 = sc.nextLine();
		String input2 = sc.nextLine();

		System.out.println("비교 연산자 : " + (input1 == input2));
		System.out.println("equals() : " + (input1.equals(input2)));
	}
}
