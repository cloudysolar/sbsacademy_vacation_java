package com.cloudysolar.lessons.day06.overlap_loop;

public class Lesson06_03 {
	public static void main(String[] args) {
		// 직각이 왼쪽 아래에 있는 직각삼각형
		int level = 3;

		for (int i = 0; i < level; i++) {
			for (int j = 0; j <= level; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
