package com.cloudysolar.lessons.day05.strings;

public class Lesson05_18 {
	public static void main(String[] args) {
		String str = "Hello World!";

		String hello = str.split(" ")[0];
		String world = str.split(" ")[1];

		System.out.println(hello + " / " + world);
	}
}
