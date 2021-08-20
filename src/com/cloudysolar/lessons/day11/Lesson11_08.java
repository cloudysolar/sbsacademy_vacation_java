package com.cloudysolar.lessons.day11;

public class Lesson11_08 {
	public static void main(String[] args) {
		String[] arr = new String[5];

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생!");
		}
	}
}
