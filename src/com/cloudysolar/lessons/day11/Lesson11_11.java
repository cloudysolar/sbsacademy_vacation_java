package com.cloudysolar.lessons.day11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lesson11_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("TextFile.txt");

		try {
			FileWriter fw = new FileWriter(file);
			String input = sc.nextLine();

			fw.write(input);
			System.out.println("파일에 " + input + " (을)를 입력하였습니다.");

			fw.flush();
			sc.close();
		} catch (IOException e) {
			System.out.println("[오류코드 0001] 파일 읽기/쓰기 관련 클래스를 초기화하지 못했습니다.");
		} finally {
			System.out.println("파일 읽기/쓰기 테스트를 완료합니다.");
		}
	}
}
