package com.cloudysolar.lessons.day12;

public class Lesson12_02 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		System.out.println("Hello World!");

		long finishTime = System.currentTimeMillis();
		long result = finishTime - startTime;

		System.out.println("- 프로세스 실행 시간 : " + result + "ms (" + (result / 1000.0) + "sec)");
	}
}
