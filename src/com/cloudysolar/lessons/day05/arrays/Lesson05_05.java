package com.cloudysolar.lessons.day05.arrays;

// 문제 1-1 : 크기가 10인 int형 배열을 만들고 숫자 10개를 입력받아 출력하는 프로그램을 만들어봅시다.

import java.util.Scanner;

public class Lesson05_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("배열에 넣을 숫자를 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
