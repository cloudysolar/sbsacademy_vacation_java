package com.cloudysolar.lessons.day07;

// 문제 1 : "안녕하세요"를 출력하는 메소드를 만들어 실행해봅시다.

public class Lesson07_12 {
	public void hello1() {
		System.out.println("안녕하세요1");
	}

	public static void hello2() {
		System.out.println("안녕하세요2");
	}

	public static void main(String[] args) {
		Lesson07_12 inst = new Lesson07_12();
		inst.hello1();

		Lesson07_12.hello2();
	}
}
