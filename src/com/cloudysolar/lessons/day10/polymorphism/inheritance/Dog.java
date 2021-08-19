package com.cloudysolar.lessons.day10.polymorphism.inheritance;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void howl() {
		System.out.println(name + "(이)가 멍멍하고 짖었습니다!");
	}

	public void eatFood() {
		System.out.println(name + "(이)가 개껌을 맛있게 먹고 있습니다.");
	}

	public void eatFood(String food) {
		System.out.println(name + "(이)가 " + food + "(을)를 맛있게 먹고 있습니다!");
	}
}
