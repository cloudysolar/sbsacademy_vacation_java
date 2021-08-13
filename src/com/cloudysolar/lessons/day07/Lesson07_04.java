package com.cloudysolar.lessons.day07;

public class Lesson07_04 {
	private void remainBackAccount() {
		System.out.println("홍길동님께서 만드신 은행 계좌는 총 10개입니다.");
	}

	public void showAccount() {
		remainBackAccount();
	}

	public static void main(String[] args) {
		Lesson07_04 inst = new Lesson07_04();

		inst.showAccount();
	}
}
