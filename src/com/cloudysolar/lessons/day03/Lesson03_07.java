package com.cloudysolar.lessons.day03;

// 논리 연산자 : &&, ||, !

public class Lesson03_07 {
	public static void main(String[] args) {
		boolean logic1 = true;
		boolean logic2 = false;

		System.out.println(logic1 + " && " + logic2 + " = " + (logic1 && logic2));
		System.out.println(logic1 + " || " + logic2 + " = " + (logic1 || logic2));
		System.out.println("!" + logic2 + " = " + !logic2);
	}
}