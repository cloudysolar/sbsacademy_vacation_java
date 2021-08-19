package com.cloudysolar.lessons.day10.information_hiding;

public class VendingMachine {
	private String products[] = new String[]{ "콜라", "사이다", "환타", "이프로", "알로에" };
	private int product_price[] = new int[]{ 1200, 1300, 1200, 1300, 1500 };

	private String selected = "";
	private int inputAmount = 0;

	public VendingMachine(int inputAmount) {
		this.inputAmount = inputAmount;
	}

	public int getRemainAmount() {
		return inputAmount;
	}

	public void buyProduct(int number) {
		if (product_price[number - 1] > inputAmount) {
			System.out.println(products[number - 1] + "(을)를 구매할 돈이 부족합니다.");
		}
		else {
			System.out.println(products[number - 1] + "(을)를 " + product_price[number - 1] + "원에 구매하였습니다.");
			inputAmount -= product_price[number - 1];
		}
	}

	public void showAllProducts() {
		for (int i = 0; i < products.length; i++) {
			System.out.println(" " + (i + 1) + ". " + products[i] + " (" + product_price[i] + "원)");
		}
	}
}
