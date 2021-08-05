package com.cloudysolar.lessons.day03;

// 복합 대입 연산자 : +=, -=, *=, /=, %=, <<=, >>=, >>>=

public class Lesson03_09 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;

		System.out.println(num1 + " += " + num2 + " = " + (num1 += num2));
		System.out.println(num1 + " -= " + num2 + " = " + (num1 -= num2));
		System.out.println(num1 + " *= " + num2 + " = " + (num1 *= num2));
		System.out.println(num1 + " /= " + num2 + " = " + (num1 /= num2));
		System.out.println(num1 + " %= " + num2 + " = " + (num1 %= num2));
		System.out.println(num1 + " <<= " + num2 + " = " + (num1 <<= num2));
		System.out.println(num1 + " >>= " + num2 + " = " + (num1 >>= num2));
		System.out.println(num1 + " >>>= " + num2 + " = " + (num1 >>>= num2));
	}
}
