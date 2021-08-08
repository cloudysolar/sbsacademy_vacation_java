package com.cloudysolar.lessons.day03;

import java.util.Scanner;

public class Lesson03_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("[짝/홀 판별] 수를 입력해주세요.");
		int input = sc.nextInt();

		String output = (input % 2 == 0) ? "짝수" : "홀수";
		System.out.println("[짝/홀 판별] 입력한 수 " + input + "(은)는 " + output + "입니다.");
	}
}
