package com.cloudysolar.lessons.day05.strings;

// 문제 1 : 문자열을 만들고 출력해봅시다. 해봤다면 입력받고 출력해봅시다.

import java.util.Scanner;

public class Lesson05_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "안녕하세요!! @==(^o^)@";
		System.out.println(str);

		String input = sc.nextLine();
		System.out.println(input);
	}
}
