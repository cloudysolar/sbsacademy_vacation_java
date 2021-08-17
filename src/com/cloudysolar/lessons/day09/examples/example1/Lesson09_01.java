package com.cloudysolar.lessons.day09.examples.example1;

public class Lesson09_01 {
	public static void main(String[] args) {
		Lesson09_01 inst = new Lesson09_01();

		TV49 tv1 = new TV49("Semsung 49", 49);
		TV52 tv2 = new TV52("HG 52", 52);

		System.out.println("49인치 TV의 모델명은 " + tv1.model + "입니다.");
		System.out.println("52인치 TV의 모델명은 " + tv2.model + "입니다.");
	}
}
