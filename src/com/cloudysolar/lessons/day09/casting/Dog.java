package com.cloudysolar.lessons.day09.casting;

public class Dog extends Animal {
	public void bark() {
		System.out.println(species + "(이)가 멍멍하고 짖었습니다!");
	}

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.species = "Dog";

		animal.move();
		// animal.bark();

		Dog dog = (Dog) animal;

		dog.bark();
	}
}
