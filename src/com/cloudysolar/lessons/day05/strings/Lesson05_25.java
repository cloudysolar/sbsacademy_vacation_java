package com.cloudysolar.lessons.day05.strings;

// 문제 4 : 문자열을 입력받고 입력받은 문자열을 띄어쓰기를 기준으로 나눠 출력해봅시다.

import java.util.Scanner;

public class Lesson05_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] inputs = input.split(" ");

		for (int i = 0; i < inputs.length; i++) {
			System.out.println("inputs[" + i + "] = " + inputs[i]);
		}
	}
}
