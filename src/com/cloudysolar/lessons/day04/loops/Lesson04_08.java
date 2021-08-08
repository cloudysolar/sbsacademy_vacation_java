package com.cloudysolar.lessons.day04.loops;

public class Lesson04_08 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println("1부터 10까지의 합: " + sum);
	}
}
