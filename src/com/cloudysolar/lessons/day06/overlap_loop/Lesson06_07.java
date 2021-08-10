package com.cloudysolar.lessons.day06.overlap_loop;

// 문제 1 : 구구단을 1단부터 9단까지 순서대로 출력해봅시다.

public class Lesson06_07 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println("\n[ " + i + "단 ]");

			for (int j = 1; j < 10; j++) {
				System.out.println("  " + i + " X " + j + " = " + (i * j));
			}
		}
	}
}
