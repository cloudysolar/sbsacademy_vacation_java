package com.cloudysolar.lessons.day09.abstraction;

public abstract class Animal {
	protected String species = "";
	protected String gender = "";
	protected int age = 0;

	public abstract void move();
	public abstract void howl();
}
