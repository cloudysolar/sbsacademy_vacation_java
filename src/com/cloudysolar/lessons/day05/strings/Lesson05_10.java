package com.cloudysolar.lessons.day05.strings;

public class Lesson05_10 {
	public static void main(String[] args) {
		String str1 = "Hello World!";
		System.out.println(str1);

		char str2_src[] = new char[] { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
		String str2 = new String(str2_src);
		System.out.println(str2);
	}
}
