package com.cloudysolar.lessons.day10.examples.example2;

public class AnimalKeeper {
	public static void main(String[] args) {
		Dog dog = new Dog("강아지", 4);

		dog.showInformation();

		dog.eat();
		dog.move();
		dog.sleep();
	}
}
