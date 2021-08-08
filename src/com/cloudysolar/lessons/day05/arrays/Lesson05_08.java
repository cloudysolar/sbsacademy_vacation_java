package com.cloudysolar.lessons.day05.arrays;

// 문제 2 : 크기가 5인 int형 배열을 만들고 숫자 5개를 입력받아 모두 더한 값을 출력하는 프로그램을 만들어봅시다.

import java.util.Scanner;

public class Lesson05_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String exp = "";

		int sum = 0;
		int arr[] = new int[5];

		System.out.println("배열에 넣을 숫자를 입력해주세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];

			exp += arr[i] + " ";

			if (!(i == (arr.length - 1))) {
				exp += "+ ";
			}
			else {
				exp += "= ";
			}
		}

		System.out.println(exp + "" + sum);
	}
}