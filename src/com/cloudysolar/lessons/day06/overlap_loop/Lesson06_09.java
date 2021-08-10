package com.cloudysolar.lessons.day06.overlap_loop;

// 문제 3 : 높이를 입력받고 해당 층 만큼의 피라미드를 *로 그려봅시다. (▲)

import java.util.Scanner;

public class Lesson06_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int level = sc.nextInt();
		for (int i = 0; i < level; i++) {
			for (int j = (level - i); j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= (i * 2); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
