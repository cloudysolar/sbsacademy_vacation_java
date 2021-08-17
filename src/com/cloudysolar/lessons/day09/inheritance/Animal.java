package com.cloudysolar.lessons.day09.inheritance;

public class Animal {
	protected String gender = "";
	protected String species = "";
	protected int age = 0;

	public void move() {
		System.out.println(species + "(이)가 움직였다!");
	}
}
