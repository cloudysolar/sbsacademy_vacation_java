package com.cloudysolar.lessons.day06.multidimension_array;

// 문제 2 : 이차원 배열을 만들어 입력받고 모든 내용을 출력하되 사각형 모양으로 출력해봅시다.

import java.util.Scanner;

public class Lesson06_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(String.format("%2d", arr[i][j]) + " ");
			}

			System.out.println();
		}
	}
}
