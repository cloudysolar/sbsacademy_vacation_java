package com.cloudysolar.lessons.day09.examples.example2;

public class Lesson09_02 {
	public static void main(String[] args) {
		Lesson09_02 inst = new Lesson09_02();

		Dog dog = new Dog("멈뭄미", 3);
		Cat cat = new Cat("고먐미", 3);

		dog.rejoice();
		cat.playCatWheel();

		dog.eat("개껌");
		cat.eat("츄르");

		dog.sleep();
		cat.sleep();
	}
}
