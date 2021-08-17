package com.cloudysolar.lessons.day09.examples.example2;

public class Animal {
	String name = "";
	int age = 0;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void move() {
		System.out.println(name + "(이)가 돌아다니고 있습니다...");
	}

	public void sleep() {
		System.out.println(name + "(이)가 자고 있습니다... Zzz");
	}

	public void eat(String food) {
		System.out.println(name + "에게 " + food + "(을)를 간식으로 주었습니다!");
	}
}
