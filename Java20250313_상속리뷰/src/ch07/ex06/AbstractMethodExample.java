package ch07.ex06;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개 변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) { //자동 타입 변환 되어 animal이란 매개변수 참조
		animal.sound(); //재정의 된 메소드 호출
	}

}
