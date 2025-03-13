package ch07.ex06;

public class Dog extends Animal { //Animal class 상속
	
	public void sound() {
		System.out.println("멍멍"); //추상 메소드 재정의(오버라이딩)
	}

}
