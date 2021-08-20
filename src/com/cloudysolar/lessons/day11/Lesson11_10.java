package com.cloudysolar.lessons.day11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson11_10 {
	public static void main(String[] args) {
		File file = new File("src");
		FileWriter fw;

		try {
			fw = new FileWriter(file);

			try {
				fw.write("폴더에 어떻게 쓰려고");
			} catch (IOException e) {
				System.out.println("[오류코드 0002] 파일에 내용을 작성할 수 없습니다. 잘못된 파일이거나 폴더인 것 같습니다.");
			}
		} catch (IOException e) {
			System.out.println("[오류코드 0001] 파일 읽기/쓰기 관련 클래스를 초기화하지 못하였습니다.");
		}
	}
}
