package ch07.ex06;

public abstract class Animal { //추상클래스
	
	public void breathe() {
		System.out.println("숨을 쉽니다"); //일반메소드
	}
	
	public abstract void sound(); //추상메소드

}
