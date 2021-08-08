package com.cloudysolar.lessons.day05.arrays;

public class Lesson05_04 {
	public static void main(String[] args) {
		int index = 3;
		int arr[] = new int[] { 10, 8, 6, 4, 2, 0 };

		System.out.println("[ 변경 전 ]");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		arr[index] = index;

		System.out.println("\n[ 변경 후 ]");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
