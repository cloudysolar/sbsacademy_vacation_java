package com.cloudysolar.lessons.day11;

// 문제 2 : Scanner 를 이용해 nextInt() 메소드를 호출하고 입력 시 String 이 입력되었을 때 발생하는 예외를 확인해봅시다.. 그리고 이 예외를 처리해 중단되지 않도록 해봅시다.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson11_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("숫자를 입력해주세요: ");
				int input = sc.nextInt();

				System.out.println("입력한 숫자는 " + input + "입니다.");
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("숫자만 입력할 수 있습니다. 정수형태의 숫자를 입력해주세요!");
				continue;
			}
		} while(true);

		System.out.println("프로그램이 종료되었습니다.");
	}
}
