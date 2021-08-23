package com.cloudysolar.lessons.day12;

// 문제 2 : 1부터 10만까지의 값 중 2와 7의 공배수의 개수를 찾는 메소드를 만들고 해당 메소드의 실행 시간을 측정해봅시다.

import java.util.Scanner;

public class Lesson12_04 {
	public int getCommonMultiples(int start, int finish, int num1, int num2) {
		int count = 0;

		for (int i = start; i <= finish; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		long prc_start = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		Lesson12_04 inst = new Lesson12_04();

		System.out.println("[입력] 시작 숫자와 종료 숫자를 띄어쓰기로 구분해 입력해주세요. 해당 숫자 범위 내에서 공배수의 개수를 검색합니다.");
		String input1 = sc.nextLine();
		System.out.println();

		System.out.println("[입력] 입력한 범위에서 찾을 공배수의 조건수 2개를 띄어쓰기로 구분해 입력해주세요.");
		String input2 = sc.nextLine();
		System.out.println();

		int start = Integer.parseInt(input1.split(" ")[0]);
		int finish = Integer.parseInt(input1.split(" ")[1]);

		int num1 = Integer.parseInt(input2.split(" ")[0]);
		int num2 = Integer.parseInt(input2.split(" ")[1]);

		long mtd_start = System.nanoTime();

		int result = inst.getCommonMultiples(start, finish, num1, num2);

		long mtd_finish = System.nanoTime();
		long mtd_result = mtd_finish - mtd_start;

		System.out.println("[결과] " + start + "부터 " + finish + "사이의 수 중 " + num1 + "(와)과 " + num2 + "의 공배수는 총 " + result + "개 입니다.");
		System.out.println();

		long prc_finish = System.currentTimeMillis();
		long prc_result = prc_finish - prc_start;

		System.out.println("[프로그램 종료]");
		System.out.println("- 전체 실행 시간 : " + prc_result + "ms (" + (prc_result / 1000.0) + "sec)");
		System.out.println("- 연산 실행 시간 : " + mtd_result + "ns (" + (mtd_result / 1000000.0) + "ms / " + (mtd_result / 1000000000.0) + "sec)");
	}
}
