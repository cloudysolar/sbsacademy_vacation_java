package com.cloudysolar.lessons.day05.arrays;

// 문제 3 : 크기가 같은 2개의 배열을 만들고 두 배열이 같은지 다른지 확인하는 프로그램을 만들어봅시다.

import java.util.Scanner;

public class Lesson05_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr1[] = new int[5];
		int arr2[] = new int[arr1.length];

		System.out.println("첫 번째 배열의 내용을 입력해주세요.");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("\n두 번째 배열의 내용을 입력해주세요.");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println("");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println("두 배열은 다른 배열입니다.");
				break;
			}

			if (i == (arr1.length - 1)) {
				System.out.println("두 배열은 같은 배열입니다.");
				break;
			}
		}
	}
}
