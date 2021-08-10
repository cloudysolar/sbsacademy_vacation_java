package com.cloudysolar.lessons.day06.overlap_loop;

public class Lesson06_02 {
	public static void main(String[] args) {
		// 피라미드 그리기
		int level = 3;

		for (int i = 0; i < level; i++) {
			for (int j = level; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= (i * (level - 1)); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
