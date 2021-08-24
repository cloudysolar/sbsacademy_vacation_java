package com.cloudysolar.lessons.day13.blockchain;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class BlockChain {
	public static ArrayList<Block> chain = new ArrayList<>();
	public static int difficulty = 4;							// 난이도가 높아질 수록 해시값 앞에 있는 0이 많아지고 그 만큼 추적이 어려워짐

	private static void manualCreate() {
		chain.add(new Block("안녕하세요, 블록체인의 첫 번째 블록입니다.", "0"));
		chain.add(new Block("안녕하세요, 블록체인의 두 번째 블록입니다.", chain.get(chain.size() - 1).hash));
		chain.add(new Block("안녕하세요, 블록체인의 세 번째 블록입니다.", chain.get(chain.size() - 1).hash));
	}

	private static void manualMine() {
		chain.add(new Block("안녕하세요, 블록체인의 첫 번째 블록입니다.", "0"));
		System.out.println("[#] 첫 번째 블록 채굴을 시도하고 있습니다 (현재 난이도 : " + difficulty + "단계)...");
		chain.get(0).mineBlock(difficulty);

		chain.add(new Block("안녕하세요, 블록체인의 두 번째 블록입니다.", chain.get(chain.size() - 1).hash));
		System.out.println("[#] 두 번째 블록 채굴을 시도하고 있습니다 (현재 난이도 : " + difficulty + "단계)...");
		chain.get(1).mineBlock(difficulty);

		chain.add(new Block("안녕하세요, 블록체인의 세 번째 블록입니다.", chain.get(chain.size() - 1).hash));
		System.out.println("[#] 세 번째 블록 채굴을 시도하고 있습니다 (현재 난이도 : " + difficulty + "단계)...");
		chain.get(2).mineBlock(difficulty);

		System.out.println("[!] 현재 블록체인 유효성 : " + isChainValid() + "\n");
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		manualMine();
		// manualCreate();

		long end = System.currentTimeMillis();
		double spend = (end - start) / 1000.0;

		String bChain = new GsonBuilder().setPrettyPrinting().create().toJson(chain);
		System.out.println("[#] 지금까지 만들어진 블록체인 : ");
		System.out.println(bChain);

		System.out.println("\n\n[#] 총 걸린 시간 : " + spend + "sec");
	}

	public static String isChainValid() {
		String result = "";

		Block current;
		Block previous;

		String hashTarget = new String(new char[difficulty]).replace('\0', '0');

		for (int i = 1; i < chain.size(); i++) {
			current = chain.get(i);
			previous = chain.get(i - 1);

			if (!current.hash.equals(current.calculateHash())) {
				result = "현재 블록의 해시값이 일치하지 않습니다!";
				return result;
			}

			if (!previous.hash.equals(previous.calculateHash())) {
				result = "이전 블록의 해시값이 일치하지 않습니다!";
				return result;
			}

			if (!current.hash.substring(0, difficulty).equals(hashTarget)) {
				result = "이 블록은 채굴된 적이 없습니다!";
				return result;
			}
		}

		result = "블록의 유효성이 검증되었습니다.";
		return result;
	}
}