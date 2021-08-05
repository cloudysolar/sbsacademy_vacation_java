package com.cloudysolar.lessons.day03;

// 증감 연산자 : ++, --

public class Lesson03_04 {
	public static void main(String[] args) {
		int var = 10;

		System.out.println("현재 값 : " + var);
		System.out.println("전위 증감 연산자(증가) : " + ++var);
		System.out.println("현재 값 : " + var);
		System.out.println("전위 증감 연산자(감소) : " + --var);
		System.out.println("현재 값 : " + var);

		System.out.println("\n====\n");

		System.out.println("현재 값 : " + var);
		System.out.println("후위 증감 연산자(증가) : " + var++);
		System.out.println("현재 값 : " + var);
		System.out.println("후위 증감 연산자(감소) : " + var--);
		System.out.println("현재 값 : " + var);
	}
}
