package com.cloudysolar.lessons.day11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson11_06 {
	public static void main(String[] args) {
		File file = new File("Test.txt");

		try {
			FileWriter fw = new FileWriter(file);

			fw.write("Hello World!");
			fw.flush();
		} catch(IOException e) {
			System.out.println("예외 발생!!!");
		}
	}
}
