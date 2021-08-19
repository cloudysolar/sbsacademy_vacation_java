package com.cloudysolar.lessons.day10.encapsulation.example1;

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

	public static void main(String[] args) {
		Car car = new Car("포터", 100);

		car.acceleration();
	}
}
