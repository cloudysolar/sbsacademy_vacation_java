package com.cloudysolar.lessons.day07;

import java.util.Scanner;

public class Lesson07_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = Integer.parseInt(sc.nextLine());
		int length = "Hello World".length();

		int random = (int)(Math.random() * number + 1);

		System.out.println("number = " + number);
		System.out.println("length = " + length);
		System.out.println("random = " + random);
	}
}
