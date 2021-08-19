package com.cloudysolar.lessons.day10.examples.example1;

public class VendingMachine {
	private String drinks[] = new String[]{ "녹차", "율무차", "둥글레차", "보이차" };
	private int price[] = new int[]{ 1000, 1200, 1100, 2000 };

	private int inputAmount;

	public void setInputAmount(int amount) {
		inputAmount = amount;
	}

	public void refundAmount() {
		System.out.println("거스름돈 " + inputAmount + "원을 돌려주었습니다.");
		inputAmount = 0;
	}

	public void showAllDrinks() {
		for (int i = 0; i < drinks.length; i++) {
			System.out.println("[" + (i + 1) + "] " + drinks[i] + " (" + price[i] + "원)");
		}
	}

	public void buyDrink(int drinkNum) {
		int number = drinkNum - 1;

		if (price[number] > inputAmount) {
			System.out.println(drinks[number] + "(을)를 구매할 돈이 부족합니다.");
		}
		else {
			inputAmount -= price[number];
			System.out.println(drinks[number] + "(을)를 " + price[number] + "원에 구매하였습니다.");
		}
	}
}
