package com.cloudysolar.lessons.day10.polymorphism.inheritance;

public class PolyTest {
	public static void main(String[] args) {
		Dog dog = new Dog("강아지", 3);

		dog.move();
		dog.eatFood();
		dog.eatFood("사료");
	}
}
