package com.cloudysolar.lessons.day02.variables;

/*
	- 문제 2 : 이 자료형들을 아래와 같은 형태로 형변환을 해봅시다.

	[ 원래 자료형 - 바꿀 자료형 ]
	byte, short - int
	int - long
	long - int
	float, double - int
	float, double - long
	long, int - double
*/

public class Lesson02_21 {
	public static void main(String[] args) {
		byte num1_1 = 120;
		short num1_2 = 3200;

		int num2_1 = num1_1;
		int num2_2 = num1_2;

		// byte, short -> int
		System.out.println("num2_1 : " + num2_1);
		System.out.println("num2_2 : " + num2_2);

		int num3_1 = 2100000000;
		long num3_2 = num3_1;
		int num3_3 = (int) num3_2;

		// int -> long
		System.out.println("num3_2 : " + num3_2);

		// long -> int
		System.out.println("num3_3 : " + num3_3);

		float num4_1 = 3.14f;
		double num4_2 = 3.14;

		int num5_1 = (int) num4_1;
		int num5_2 = (int) num4_2;

		// float, double -> int
		System.out.println("num5_1 : " + num5_1);
		System.out.println("num5_2 : " + num5_2);

		float num6_1 = 3.14f;
		double num6_2 = 3.14;

		long num7_1 = (long) num6_1;
		long num7_2 = (long) num6_2;

		// float, double -> long
		System.out.println("num7_1 : " + num7_1);
		System.out.println("num7_2 : " + num7_2);

		int num8_1 = 1234;
		long num8_2 = 5678L;

		double num9_1 = num8_1;
		double num9_2 = num8_2;

		// int, long -> double
		System.out.println("num9_1 : " + num9_1);
		System.out.println("num9_2 : " + num9_2);
	}
}
