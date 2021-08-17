package com.cloudysolar.lessons.day09.examples.example2;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}

	public void bark() {
		System.out.println(name + "(이)가 멍멍 짖고있습니다!!");
	}

	public void rejoice() {
		System.out.println(name + "(이)가 제가 온 것을 반기고 있습니다~");
	}
}
