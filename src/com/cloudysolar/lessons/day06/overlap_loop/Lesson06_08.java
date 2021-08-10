package com.cloudysolar.lessons.day06.overlap_loop;

// 문제 2 : 한 변의 길이를 입력받고 해당 길이만큼의 정사각형을 *로 그려봅시다. (■)

import java.util.Scanner;

public class Lesson06_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
