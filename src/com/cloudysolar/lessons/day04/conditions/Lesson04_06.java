package com.cloudysolar.lessons.day04.conditions;

// 문제 2 : 숫자를 입력받고 아래 조건에 맞게 출력해봅시다.

import java.util.Scanner;

public class Lesson04_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String service = "";
		int speed = sc.nextInt();

		switch(speed) {
			case 100:
				service = "광랜";
				break;
			case 500:
				service = "반기가인터넷";
				break;
			case 1000:
				service = "기가인터넷";
				break;
			case 10000:
				service = "10기가인터넷";
				break;
			default:
				service = "다른인터넷";
				break;
		}

		System.out.println("현재 이용하고 계시는 인터넷 서비스의 이름은 " + service + " 입니다.");
	}
}
