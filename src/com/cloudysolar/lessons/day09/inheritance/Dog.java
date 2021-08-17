package com.cloudysolar.lessons.day09.inheritance;

public class Dog extends Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.species = "Dog";
		dog.gender = "M";
		dog.age = 3;

		dog.move();
	}
}
