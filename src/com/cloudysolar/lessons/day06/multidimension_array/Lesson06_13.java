package com.cloudysolar.lessons.day06.multidimension_array;

// 문제 1 : 이차원 배열을 만들어 입력받고, 모든 내용을 출력해봅시다.

import java.util.Scanner;

public class Lesson06_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[2][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}
}
