package com.cloudysolar.lessons.day09.examples.example2;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}

	public void grooming() {
		System.out.println(name + "(이)가 그루밍하고 있습니다...");
	}

	public void playCatWheel() {
		System.out.println(name + "(이)가 캣휠을 돌리고 있습니다!");
	}
}
