package com.cloudysolar.lessons.day06.overlap_loop;

public class Lesson06_04 {
	public static void main(String[] args) {
		// 직각이 오른쪽 아래에 있는 직각삼각형
		int level = 3;

		for (int i = 0; i < level; i++) {
			for (int j = (level - 1); j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
