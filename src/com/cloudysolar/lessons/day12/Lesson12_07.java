package com.cloudysolar.lessons.day12;

import java.util.HashMap;

public class Lesson12_07 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		// 맵 초기화
		map.clear();

		// 맵에 키와 값을 하나의 쌍으로 엔트리에 추가
		map.put("Month", 8);
		map.put("Day", 23);

		// 맵에 키 또는 값이 포함되어 있는지 여부에 따라 boolean 값 출력
		System.out.println(map.containsKey("Month"));
		System.out.println(map.containsValue(20));

		// 맵에서 키를 통해 값 가져오기
		System.out.println(map.get("Month"));

		// 맵에서 키와 값 제거하기
		map.remove("Month");
		map.remove("Day");

		// 맵이 비어있는지 여부에 따라 boolean 값 출력
		System.out.println(map.isEmpty());
	}
}
