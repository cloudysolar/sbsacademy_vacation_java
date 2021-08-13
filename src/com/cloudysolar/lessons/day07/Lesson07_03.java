package com.cloudysolar.lessons.day07;

public class Lesson07_03 {
	void setWeather(double rainRate) {
		System.out.println("해당 지역의 강수 확률을 " + rainRate + "%로 조절하였습니다.");
	}

	public static void main(String[] args) {
		Lesson07_03 inst = new Lesson07_03();
		inst.setWeather(12.5);
	}
}
