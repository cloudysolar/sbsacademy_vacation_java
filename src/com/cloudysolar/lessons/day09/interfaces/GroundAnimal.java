package com.cloudysolar.lessons.day09.interfaces;

public interface GroundAnimal {
	String house = "거실";

	default String getHouse() {
		return house;
	}
}