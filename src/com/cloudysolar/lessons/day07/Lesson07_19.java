package com.cloudysolar.lessons.day07;

public class Lesson07_19 {
	static String args = "Hello!";

	public static void main(String[] args) {
		System.out.println(Lesson07_19.args);

		// 편집창 오른쪽 클릭 > Modify Run Configuration(실행 설정 변경) > 빌드 및 실행 > 프로그램 인자 텍스트 입력란에 ""로 텍스트 입력 후 [OK(확인)]
		System.out.println(args[0]);
	}
}
