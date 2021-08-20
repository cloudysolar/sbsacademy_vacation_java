package com.cloudysolar.lessons.day11;

public class Lesson11_16 {
	public void throwException() throws Exception {
		throw new Exception("예외 받아랏!");
	}

	public static void main(String[] args) {
		Lesson11_16 inst = new Lesson11_16();

		try {
			inst.throwException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
