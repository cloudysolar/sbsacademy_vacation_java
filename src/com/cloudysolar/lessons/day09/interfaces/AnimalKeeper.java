package com.cloudysolar.lessons.day09.interfaces;

public class AnimalKeeper {
	// 인터페이스로 그룹화하기 이전 메소드들
	public void giveHouse(Dog dog, String house) {
		System.out.println("반려동물에게 " + house + "(을)를 주었습니다.");
	}

	public void giveHouse(Cat cat, String house) {
		System.out.println("반려동물에게 " + house + "(을)를 주었습니다.");
	}

	public void giveHouse(TropicalFish fish, String house) {
		System.out.println("반려동물에게 " + house + "(을)를 주었습니다.");
	}

	// 인터페이스로 그룹화 한 후 메소드들
	public void giveHouse(GroundAnimal animal) {
		System.out.println("반려동물에게 " + animal.getHouse() + "(을)를 주었습니다.");
	}

	public void giveHouse(WaterAnimal animal) {
		System.out.println("반려동물에게 " + animal.getHouse() + "(을)를 주었습니다.");
	}

	public static void main(String[] args) {
		AnimalKeeper keeper = new AnimalKeeper();

		Dog dog = new Dog();
		Cat cat = new Cat();
		TropicalFish fish = new TropicalFish();

		// 인터페이스로 그룹화하기 이전 메소드 호출
		/*keeper.giveHouse(dog, "거실");
		keeper.giveHouse(cat, "거실");
		keeper.giveHouse(fish, "어항");*/

		// 인터페이스로 그룹화한 후 메소드 호출
		keeper.giveHouse(dog);
		keeper.giveHouse(cat);
		keeper.giveHouse(fish);
	}
}
