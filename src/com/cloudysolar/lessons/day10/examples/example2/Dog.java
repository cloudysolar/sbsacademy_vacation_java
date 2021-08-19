package com.cloudysolar.lessons.day10.examples.example2;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println(getName() + "(이)가 무언가 맛있게 먹고 있습니다!");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + "(이)가 잘 자고 있습니다!");
	}

	@Override
	public void move() {
		System.out.println(getName() + "(이)가 총총 돌아다니고 있습니다!");
	}
}
