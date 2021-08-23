package com.cloudysolar.lessons.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson12_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		// 리스트 초기화하기
		list.clear();

		// 리스트에 값 추가하기
		list.add(10);
		list.add(100);

		// 리스트에 값이 포함되어 있는지 여부에 따라 boolean 값 반환
		System.out.println(list.contains(10));

		// 인덱스 번호를 이용해 리스트에서 값 가져오기
		System.out.println(list.get(0));

		// 리스트에서 인덱스 번호로 값 제거
		list.remove(0);
		list.remove(0);

		// 리스트가 비어 있는지 여부에 따라 boolean 값 반환
		System.out.println(list.isEmpty());
	}
}
