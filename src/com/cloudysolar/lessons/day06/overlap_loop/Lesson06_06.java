package com.cloudysolar.lessons.day06.overlap_loop;

public class Lesson06_06 {
	public static void main(String[] args) {
		// 직각이 오른쪽 위에 있는 직각삼각형
		int level = 3;

		for (int i = 0; i < level; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = (level - i); k > 0; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
