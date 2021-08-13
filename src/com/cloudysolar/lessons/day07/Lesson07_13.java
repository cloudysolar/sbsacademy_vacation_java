package com.cloudysolar.lessons.day07;

// 문자열을 매개변수로 받아 출력하는 메소드를 만들어 실행해봅시다.

import java.util.Scanner;

public class Lesson07_13 {
	public void printMessage(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		Lesson07_13 inst = new Lesson07_13();
		Scanner sc = new Scanner(System.in);

		inst.printMessage(sc.nextLine());
	}
}
