package com.cloudysolar.lessons.day02.print;

// 문제 3-2 : 오늘 날짜를 출력해봅시다. (서식 문자 사용)

public class Lesson02_07 {
	public static void main(String[] args) {
		System.out.println(String.format("%04d년 %02d월 %02d일 %s요일", 2021, 8, 4, "목"));
	}
}
