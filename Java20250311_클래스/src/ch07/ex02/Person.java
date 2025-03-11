package ch07.ex02;
/*
 * 사람 클래스
 * 사람의 특징 - name,age,height,weight...
 * 사람의 동작 - run, sleep,eat,study...
 * 
 * 간추려 내는 과정을 추상화
 */
//object에 있는 것은 모든 class가 접근 가능

public class Person {

	private String name;
	private int age;
	
	public void run() {
		System.out.println("Run!");
	} //다른 패키지에서 쓰고 싶으면 public을 붙여줘야함
	public void eat() {
		System.out.println("Eat!");
	}
	
}
