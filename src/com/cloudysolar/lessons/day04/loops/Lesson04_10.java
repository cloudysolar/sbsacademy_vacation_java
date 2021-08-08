package com.cloudysolar.lessons.day04.loops;

public class Lesson04_10 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		do {
			sum += i;
			i++;
		} while (i <= 10);

		System.out.println("1부터 10까지의 합: " + sum);
	}
}
