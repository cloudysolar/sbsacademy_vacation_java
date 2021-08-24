package com.cloudysolar.lessons.day13;

import java.util.Scanner;

public class BullsAndCow {
	private String computer = "";
	private String player = "";

	private int numberSize = 4;
	private int turnLimit = 18;

	private boolean isDebug = false;

	public void initGame(String player) {
		this.player = player;
		this.computer = makeRandomNumbers();

		if (isDebug) System.out.println("[숫자야구:디버그] 플레이어의 숫자 : " + this.player + " / 컴퓨터의 숫자 : " + this.computer);
	}

	public String gameTurn(Scanner sc, int nowTurn) {
		String enemy = "";
		String result = "";

		System.out.println("\n[숫자야구] 현재 턴: " + nowTurn);

		if (nowTurn == 0) {
			enemy = "Computer";

			System.out.println("[숫자야구] 플레이어가 첫 번째 턴입니다. 컴퓨터의 숫자를 예측하세요.");
			String input = sc.nextLine();

			result = this.checkNumber(enemy, input);
			System.out.println("\n[숫자야구] 컴퓨터로부터 받은 결과는 다음과 같습니다: " + result);
		}
		else {
			if (nowTurn % 2 == 0) {
				enemy = "Computer";

				System.out.println("[숫자야구] 플레이어의 턴 입니다. 컴퓨터의 숫자를 예측하세요.");
				String input = sc.nextLine();

				result = this.checkNumber(enemy, input);
				System.out.println("\n[숫자야구] 컴퓨터로부터 받은 결과는 다음과 같습니다: " + result);
			}
			else {
				enemy = "Player";
				System.out.println("[숫자야구] 컴퓨터의 턴이 진행 중입니다. 잠시만 기다려 주세요...");

				String pred = makeRandomNumbers();
				result = this.checkNumber(enemy, pred);

				System.out.println("\n[숫자야구] 컴퓨터가 예측한 숫자는 " + pred + "입니다. 결과: " + result);
			}
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("[오류!] 스레드를 일시정지 시키지 못하였습니다.");
		}

		if (result.charAt(0) == '4') {
			return (enemy.equals("Player") ? "Computer" : "Player");
		}
		else {
			return "Draw";
		}
	}

	public String checkNumber(String player, String answer) {
		int strike = 0;
		int ball = 0;
		int out = 0;

		if (isDebug) System.out.println("\n[숫자야구:디버그] 숫자를 확인 중입니다...");
		String comp = (player.equals("Player") ? this.player : this.computer);

		for (int i = 0; i < comp.length(); i++) {
			for (int j = 0; j < answer.length(); j++) {
				if (comp.charAt(i) == answer.charAt(j)) {
					if (i == j) {
						strike++;
						break;
					}
					else {
						ball++;
						break;
					}
				}

				if ((j + 1) == answer.length()) {
					out++;
				}
			}
		}

		String result = strike + "s" + ball + "b" + out + "o";

		return result;
	}

	public String makeRandomNumbers() {
		String cpu = "";

		if (isDebug) System.out.println("\n[숫자야구:디버그] 컴퓨터의 무작위 숫자를 생성합니다. 잠시만 기다려 주세요...");
		for (int i = 0; i < numberSize; i++) {
			int random = (int)(Math.random() * 10);
			char randChar = (char)(random + '0');
			boolean isDup = false;

			if (isDebug) System.out.println("[숫자야구:디버그] 랜덤으로 생성된 " + (i + 1) + "번째 숫자 : " + random);

			for (int j = 0; j < cpu.length(); j++) {
				if (randChar == cpu.charAt(j)) {
					if (isDebug) System.out.println("[숫자야구:디버그] 앞서 생성된 " + (j + 1) + "번째 숫자와 겹치므로 재생성");
					i--;
					isDup = true;
					break;
				}
			}

			if (isDup) {
				continue;
			}

			cpu += randChar;
		}

		return cpu;
	}

	public static void main(String[] args) {
		BullsAndCow inst = new BullsAndCow();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("[숫자야구] 게임을 시작하기 전 사용할 숫자의 개수를 선택해주세요.");
			System.out.println("1. 3개 / 2. 4개 / 3. 종료");

			String m1_input = sc.nextLine();

			if (m1_input.equals("1") || m1_input.equals("2")) {
				inst.numberSize = (m1_input.equals("1") ? 3 : 4);

				System.out.println("\n[숫자야구] 게임을 시작합니다. 컴퓨터가 맞출 숫자 " + inst.numberSize + "자리를 입력해주세요. (게임 종료는 exit을 입력해주세요.)");

				String m2_input = sc.nextLine();

				if (m2_input.equals("exit")) {
					break;
				}
				else if (m2_input.length() == inst.numberSize) {
					inst.initGame(m2_input);

					for (int i = 0; i < inst.turnLimit; i++) {
						String result = inst.gameTurn(sc, i);

						if (!result.equals("Draw")) {
							System.out.println("[숫자야구] " + (result.equals("Player") ? "플레이어" : "컴퓨터") + "(이)가 승리하였습니다. 게임을 종료합니다.");
							return;
						}

						if ((i + 1) == inst.turnLimit) {
							System.out.println("[숫자야구] 플레이어와 컴퓨터 둘 다 맞추지 못해 동점으로 게임이 종료되었습니다. 다시 시작합니다...");
							System.out.println("[숫자야구] 컴퓨터가 생성한 숫자는 " + inst.computer + "였습니다.\n");

							continue;
						}
					}
				}
				else {
					System.out.println("[숫자야구] " + inst.numberSize + "자리로 입력해주셔야 합니다. 처음부터 다시 시작합니다.");
					continue;
				}
			}
			else if (m1_input.equals("toggledebugmode")) {
				inst.isDebug = !inst.isDebug;
				System.out.println("[숫자야구:디버그] 숫자야구 프로그램의 디버그 모드를 " + inst.isDebug + "(으)로 변경하였습니다.\n");
			}
			else {
				break;
			}
		} while (true);

		System.out.println("[숫자야구] 프로그램을 종료합니다.");
	}
}
