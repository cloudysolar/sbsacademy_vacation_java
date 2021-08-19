package com.cloudysolar.lessons.day10.encapsulation.example2;

public class Car {
	String model;
	int speed;

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	public void acceleration() {
		System.out.println(model + "(이)가 시속 " + speed + "km로 가속하였습니다.");
	}
}
