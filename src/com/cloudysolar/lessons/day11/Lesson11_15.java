package com.cloudysolar.lessons.day11;

// 문제 3 : 2번을 해결하고 finally 를 이용해 "finally 작동!" 을 출력해봅시다.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson11_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("숫자를 입력해주세요: ");
			int input = sc.nextInt();

			System.out.println("입력한 숫자는 " + input + "입니다.");
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("숫자만 입력할 수 있습니다.");
		} finally {
			System.out.println("finally 작동!");
		}

		System.out.println("프로그램이 종료되었습니다.");
	}
}
