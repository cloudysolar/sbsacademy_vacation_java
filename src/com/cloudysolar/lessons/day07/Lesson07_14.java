package com.cloudysolar.lessons.day07;

// 문제 3 : 숫자 하나를 매개변수로 받아 제곱하여 반환하는 메소드를 만들어 실행해봅시다.

import java.util.Scanner;

public class Lesson07_14 {
	public int pow(int source) {
		return source * source;
	}

	public static void main(String[] args) {
		Lesson07_14 inst = new Lesson07_14();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(num + "(을)를 제곱한 수는 " + inst.pow(num) + "입니다.");
	}
}
