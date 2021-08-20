package com.cloudysolar.lessons.day11;

// 문제 1 : ArrayIndexOutOfBoundsException 을 강제로 발생시켜보고 이를 처리해봅시다.

public class Lesson11_13 {
	public static void main(String[] args) {
		String[] arr = new String[5];

		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생해 더 이상 프로그램을 실행할 수 없습니다.");
		}
	}
}
