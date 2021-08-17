package com.cloudysolar.lessons.day09.interfaces;

public interface WaterAnimal {
	String house = "어항";

	default String getHouse() {
		return house;
	}
}
