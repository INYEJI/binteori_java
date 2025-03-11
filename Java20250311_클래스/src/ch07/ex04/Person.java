package ch07.ex04;
/*
 *  static(정적) <==> 인스턴스
 *  인스턴스 변수(멤버변수), 인스턴스 메소드(멤버 메소드)
 *  정적변수, 정적메소드
 */

public class Person {

	private String name;
	private int age;
	
	static int count; //정적변수
	
	static void f1() {
		
	}
	
	static void func() { //static이 붙은 것만 사용가능(객체를 생성하지 않고도 사용할 수 있기 땜에^)
		System.out.println("정적메소드 func()");
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	String displayInfo() {
		return name + ";" + age;
	}
	
	public void run() { //static 붙은거랑 안 붙은거 둘 다 사용가능
		System.out.println("Run!");
	} //다른 패키지에서 쓰고 싶으면 public을 붙여줘야함
	public void eat() {
		System.out.println("Eat!");
	}
	
}
