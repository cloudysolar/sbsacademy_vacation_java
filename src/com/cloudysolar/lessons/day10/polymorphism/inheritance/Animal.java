package com.cloudysolar.lessons.day10.polymorphism.inheritance;

public class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void move() {
		System.out.println(name + "(이)가 움직였습니다!");
	}

	public void howl() {
		System.out.println(name + "(이)가 울었습니다!");
	}
}
