package com.cloudysolar.lessons.day12;

public class Lesson12_01 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		System.out.println("Hello World!");

		long finishTime = System.nanoTime();
		long result = finishTime - startTime;

		double resultMs = result / 1000000.0;

		System.out.println("- 프로세스 실행 시간 : " + result + "ns (" + resultMs + "ms / " + String.format("%.7f", (resultMs / 1000.0) )+ "sec)");
	}
}
