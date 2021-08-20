package com.cloudysolar.lessons.day11;

import java.util.Scanner;

public class Lesson11_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("설정할 종료코드를 정수형 숫자로 입력해주세요: ");
		int exitCode = sc.nextInt();

		System.exit(exitCode);
	}
}
