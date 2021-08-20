package com.cloudysolar.lessons.day11;

public class Lesson11_07 {
	public static void main(String[] args) {
		String[] arr = new String[5];

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[Exception!] 예외가 발생하였습니다. 배열의 범위를 넘어선 값에 대해 접근할 수 없습니다.");
		}
	}
}
