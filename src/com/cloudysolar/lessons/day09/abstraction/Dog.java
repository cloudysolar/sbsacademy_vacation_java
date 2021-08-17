package com.cloudysolar.lessons.day09.abstraction;

public class Dog extends Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.species = "Dog";

		dog.move();
		dog.howl();
	}

	@Override
	public void move() {
		System.out.println(species + "(이)가 돌아다니고 있습니다...");
	}

	@Override
	public void howl() {
		System.out.println(species + "(이)가 멍멍하고 짖었습니다!");
	}
}
