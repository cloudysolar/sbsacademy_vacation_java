package com.cloudysolar.lessons.day10.examples.example2;

public abstract class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void eat();
	public abstract void sleep();
	public abstract void move();

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void showInformation() {
		System.out.println(getName() + " (" + getAge() + "살)");
	}
}
