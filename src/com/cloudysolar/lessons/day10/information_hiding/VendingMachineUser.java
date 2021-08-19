package com.cloudysolar.lessons.day10.information_hiding;

import java.util.Scanner;

public class VendingMachineUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("자판기에 넣을 금액을 입력해주세요: ");
		int input = sc.nextInt();

		VendingMachine vm = new VendingMachine(input);

		vm.showAllProducts();

		System.out.println("자판기에서 구매할 항목의 번호를 입력해주세요: ");
		int input_menu = sc.nextInt();

		vm.buyProduct(input_menu);

		System.out.println("거스름돈 " + vm.getRemainAmount() + "원을 받았습니다.");
	}
}
