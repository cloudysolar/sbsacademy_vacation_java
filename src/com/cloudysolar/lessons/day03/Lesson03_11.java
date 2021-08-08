package com.cloudysolar.lessons.day03;

// 문제 2 : true와 false를 이용해 비교연산자를 사용해 출력해봅시다.

public class Lesson03_11 {
	public static void main(String[] args) {
		boolean bool1 = true;
		boolean bool2 = false;

		System.out.println(bool1 + " && " + bool2 + " = " + (bool1 && bool2));
		System.out.println(bool1 + " || " + bool2 + " = " + (bool1 || bool2));
		System.out.println("!" + bool2 + " = " + (!bool2));
	}
}
