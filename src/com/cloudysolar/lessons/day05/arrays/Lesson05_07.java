package com.cloudysolar.lessons.day05.arrays;

// 문제 1-3 : 입력 받은 값을 거꾸로 출력해봅시다.

import java.util.Scanner;

public class Lesson05_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열의 크기를 입력하세요.");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("\n배열에 넣을 숫자를 입력하세요.");
		for (int i = (arr.length - 1); i >= 0; i--) {
			arr[i] = sc.nextInt();
		}

		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
