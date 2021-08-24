package com.cloudysolar.lessons.day13.blockchain;

import java.util.Date;

public class Block {
	public String hash;			// 이 블록의 해시값
	public String prevHash;		// 이 블록 생성 전에 있던 블록의 해시값

	private String data;		// 블록에 넣을 데이터
	private long timeStamp;		// 블록이 생성된 시간

	private long nonce;			// 난이도에 따른 해시값을 추적하기 위해 넣는 다른 변수

	// 블록 생성자
	public Block(String data, String prevHash) {
		this.data = data;
		this.prevHash = prevHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
	}

	public String calculateHash() {
		String calculated = StringUtil.applySHA256(prevHash + Long.toString(timeStamp) + Long.toString(nonce) + data);

		return calculated;
	}

	public void mineBlock(int difficulty) {
		/*
		final int MAX_COUNT = 100000000;
		int count = 0;
		*/

		boolean isMined = true;

		long start = System.currentTimeMillis();

		String target = new String(new char[difficulty]).replace('\0', '0');

		while(!hash.substring(0, difficulty).equals(target)) {
			nonce ++;
			hash = calculateHash();

			/*
			count++;

			if (count == MAX_COUNT) {
				isMined = false;
				break;
			}
			 */
		}

		long end = System.currentTimeMillis();
		double spend = (end - start) / 1000.0;

		if (isMined) {
			System.out.println("[!] 블록이 채굴되었습니다 : " + hash);
		}
		else {
			System.out.println("[!] 블록이 채굴되지 못했습니다 : 시간 초과");
		}

		System.out.println("    - 흐른 시간 : " + spend + "초\n");
	}
}