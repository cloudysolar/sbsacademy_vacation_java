package com.cloudysolar.lessons.day10.examples.example1;

import java.util.Scanner;

public class VendingMachineUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VendingMachine vm = new VendingMachine();

		System.out.println("자판기에 입금할 금액을 입력하세요.");
		vm.setInputAmount(sc.nextInt());
		vm.showAllDrinks();

		System.out.println("자판기에서 구매할 아이템의 번호를 입력하세요.");
		vm.buyDrink(sc.nextInt());
		vm.refundAmount();
	}
}
