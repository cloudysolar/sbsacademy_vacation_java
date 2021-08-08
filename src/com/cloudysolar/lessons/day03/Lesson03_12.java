package com.cloudysolar.lessons.day03;

// 문제 3 : 비트 시프트 연산자를 이용해 값이 어떻게 바뀌는지 확인해봅시다.

public class Lesson03_12 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;

		System.out.println(num1 + " << " + num2 + " = " + (num1 << num2));
		System.out.println(num1 + " >> " + num2 + " = " + (num1 >> num2));
		System.out.println(num1 + " >>> " + num2 + " = " + (num1 >>> num2));
	}
}
