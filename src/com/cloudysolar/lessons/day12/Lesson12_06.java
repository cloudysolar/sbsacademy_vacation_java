package com.cloudysolar.lessons.day12;

import java.util.LinkedList;

public class Lesson12_06 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		// 리스트 초기화
		list.clear();

		// 리스트에 값 추가
		list.add(10);
		list.add(100);

		// 리스트에 값이 포함되어 있는지 여부에 따라 boolean 값 출력
		System.out.println(list.contains(100));

		// 리스트에서 인덱스 번호로 값 가져오기
		System.out.println(list.get(1));

		// 리스트에서 인덱스 번호로 원소 제거
		list.remove(0);
		list.remove(0);

		// 리스트가 비어있는지 여부에 따라 boolean 값 출력
		System.out.println(list.isEmpty());
	}
}
