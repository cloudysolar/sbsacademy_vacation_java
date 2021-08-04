package com.cloudysolar.lessons.day02.variables;

// 문제 1 : 지금까지 배운 모든 자료형을 출력해봅시다.

public class Lesson02_20 {
	public static void main(String[] args) {
		boolean bool = true;

		char ch = 'B';

		byte num1 = 120;
		short num2 = 3200;
		int num3 = 2100000000;
		long num4 = 9220000000000000000L;

		float pie1 = 3.141592f;
		double pie2 = 3.141592;

		String hello = "Hi! everyone!!";

		System.out.println("boolean : " + bool);
		System.out.println("char : " + ch + "(" +  (int)ch + ")");
		System.out.println("byte : " + num1);
		System.out.println("short : " + num2);
		System.out.println("int : " + num3);
		System.out.println("long : " + num4);
		System.out.println("float : " + pie1);
		System.out.println("double : " + pie2);
		System.out.println("String : " + hello);
	}
}
