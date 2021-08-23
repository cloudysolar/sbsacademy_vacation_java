package com.cloudysolar.lessons.day12;

// 문제 1 : 1부터 10억까지 더해 값을 출력하는 메소드를 만들고 해당 메소드의 실행 시간을 측정해봅시다.

import java.util.Scanner;

public class Lesson12_03 {
	public long addNumbers(int start, int finish) {
		long result = 0;

		for (int i = start; i <= finish; i++) {
			result += (long) i;
		}

		return result;
	}

	public static void main(String[] args) {
		long prc_start = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		Lesson12_03 inst = new Lesson12_03();

		System.out.println("[입력] 시작 숫자와 종료 숫자를 띄어쓰기로 구분해 입력해주세요. 해당 숫자 범위 내에 있는 모든 숫자를 더해 출력합니다.");
		String input = sc.nextLine();

		System.out.println();

		int start = Integer.parseInt(input.split(" ")[0]);
		int finish = Integer.parseInt(input.split(" ")[1]);

		long mtd_start = System.nanoTime();

		long result = inst.addNumbers(start, finish);

		long mtd_finish = System.nanoTime();
		long mtd_result = mtd_finish - mtd_start;

		System.out.println("[결과] " + start + "부터 " + finish + "까지 모두 더한 값은 " + result + "입니다.");
		System.out.println();

		long prc_finish = System.currentTimeMillis();
		long prc_result = prc_finish - prc_start;

		System.out.println("[프로그램 종료]");
		System.out.println("- 전체 실행 시간 : " + prc_result + "ms (" + (prc_result / 1000.0) + "sec)");
		System.out.println("- 연산 실행 시간 : " + mtd_result + "ns (" + (mtd_result / 1000000.0) + "ms / " + (mtd_result / 1000000000.0) + "sec)");
	}
}
