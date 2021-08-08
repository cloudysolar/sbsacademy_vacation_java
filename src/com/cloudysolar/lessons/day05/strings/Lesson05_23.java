package com.cloudysolar.lessons.day05.strings;

// 문제 2 : 문자열을 입력받고 해당 문자열에 알파벳이 몇개 있는지 출력해봅시다.

import java.util.Scanner;

public class Lesson05_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int abc[] = new int[27];

		for (int i = 0; i < input.length(); i++) {
			char index = input.toLowerCase().charAt(i);

			switch(index) {
				case 'a':
					abc[0]++;
					break;
				case 'b':
					abc[1]++;
					break;
				case 'c':
					abc[2]++;
					break;
				case 'd':
					abc[3]++;
					break;
				case 'e':
					abc[4]++;
					break;
				case 'f':
					abc[5]++;
					break;
				case 'g':
					abc[6]++;
					break;
				case 'h':
					abc[7]++;
					break;
				case 'i':
					abc[8]++;
					break;
				case 'j':
					abc[9]++;
					break;
				case 'k':
					abc[10]++;
					break;
				case 'l':
					abc[11]++;
					break;
				case 'm':
					abc[12]++;
					break;
				case 'n':
					abc[13]++;
					break;
				case 'o':
					abc[14]++;
					break;
				case 'p':
					abc[15]++;
					break;
				case 'q':
					abc[16]++;
					break;
				case 'r':
					abc[17]++;
					break;
				case 's':
					abc[18]++;
					break;
				case 't':
					abc[19]++;
					break;
				case 'u':
					abc[20]++;
					break;
				case 'v':
					abc[21]++;
					break;
				case 'w':
					abc[22]++;
					break;
				case 'x':
					abc[23]++;
					break;
				case 'y':
					abc[24]++;
					break;
				case 'z':
					abc[25]++;
					break;
				default:
					abc[26]++;
					break;
			}
		}

		for (int i = 0; i < abc.length; i++) {
			if (i < 26) {
				System.out.println((char)(65 + i) + " = " + abc[i]);
			}
			else {
				System.out.println("특수문자 = " + abc[26]);
			}
		}
	}
}
