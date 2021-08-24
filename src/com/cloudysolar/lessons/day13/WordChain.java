package com.cloudysolar.lessons.day13;

import java.util.ArrayList;
import java.util.Scanner;

public class WordChain {
	static ArrayList<String> history = new ArrayList<>();

	public static char completeTurn(String input) {
		char lastWord = input.charAt(input.length() - 1);

		System.out.println();
		history.add(input);

		return lastWord;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1;
		char lastWord = ' ';

		System.out.println("[끝말잇기] 게임을 시작합니다.");

		do {
			System.out.println("[끝말잇기 (" + count + ")] 앞 단어에 이어서 단어를 입력해주세요. (끝내려면 exit을 입력합니다.)");
			String input = sc.nextLine();

			if (input.equals("exit")) {
				break;
			}
			else {
				if (lastWord != ' ') {
					if (input.charAt(0) != lastWord) {
						System.out.println("\n[끝말잇기] 패배! 앞 단어의 끝 음절과 입력한 단어의 첫 음절이 다릅니다. (앞 단어: " + lastWord + " / 현재 단어 : " + input.charAt(0) + ")");
						break;
					}
					else {
						if (history.contains(input)) {
							System.out.println("\n[끝말잇기] 패배! 이미 앞에서 나온 단어입니다. (위치 : " + (history.indexOf(input) + 1) + ")");
							break;
						}
						else {
							lastWord = completeTurn(input);
						}
					}
				}
				else {
					lastWord = completeTurn(input);
				}
			}

			count++;
		} while (true);

		System.out.println("\n[끝말잇기] 진행 결과: " + history.toString());
		System.out.println("\n[끝말잇기] 프로그램이 종료되었습니다.");
	}
}