package com.cloudysolar.lessons.day02.output;

import java.util.Scanner;

public class Lesson02_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("> 숫자를 입력해주세요: ");
		int num = sc.nextInt();

		System.out.println(">> 입력된 숫자는 " + num + "입니다.");

		System.out.println("\n> 0~32767 사이의 숫자를 입력해주세요: ");
		int numch = sc.nextInt();
		char ch = (char) numch;

		System.out.println(">> 입력된 숫자 " + numch + "(을)를 문자와 숫자로 바꾼 결과입니다.");
		System.out.println(" - char: " + ch);
		System.out.println(" - int: " + (int)ch);
	}
}
