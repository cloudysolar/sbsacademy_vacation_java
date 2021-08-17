package com.cloudysolar.lessons.day09.inheritance;

public class Cat extends Animal {
	public static void main(String[] args) {
		Cat cat = new Cat();

		cat.species = "Cat";
		cat.gender = "F";
		cat.age = 2;

		cat.move();
	}
}
