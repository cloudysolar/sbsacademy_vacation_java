package com.cloudysolar.lessons.day03;

// 비트 연산자 : &, |, ^, ~, <,, >>, >>>

public class Lesson03_08 {
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 2;

		System.out.println(num1 + " & " + num2 + " = " + (num1 & num2));
		System.out.println(num1 + " | " + num2 + " = " + (num1 | num2));
		System.out.println(num1 + " ^ " + num2 + " = " + (num1 ^ num2));
		System.out.println("~" + num2 + " = " + (~num2));
		System.out.println(num1 + " << " + num2 + " = " + (num1 << num2));
		System.out.println(num1 + " >> " + num2 + " = " + (num1 >> num2));
		System.out.println(num1 + " >>> " + num2 + " = " + (num1 >>> num2));
	}
}
