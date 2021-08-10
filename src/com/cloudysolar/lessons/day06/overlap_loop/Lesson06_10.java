package com.cloudysolar.lessons.day06.overlap_loop;

// 문제 4 : 3번까지 혼자 힘으로 해냈다면 다이아몬드를 그려봅시다 (◆)

import java.util.Scanner;

public class Lesson06_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int level = sc.nextInt();

		// 피라미드의 반절 그리기
		for (int i = 0; i < level; i++) {
			for (int j = (level - i); j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= (i * 2); k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// 나머지 반절 그리기
		for (int i = (level - 1); i > 0; i--) {
			for (int j = level; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= ((i - 1) * 2); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
