package ch07.ex07;

public class A {
	private String name;
	private int age;
	
	A(){}
	
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void funcA() {
		System.out.println("funcA()");
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
	}

}

class B extends A{
	private String address;
	
	B(){}
	
	B(String name, int age, String address){
		super(name,age);
		this.address = address;
		}
	
	//상위클래스가 가지고 있는 메소드 =>재정의,오버라이딩
	void info(){
		System.out.println("B class");
	}
	
	void funcB() {
		System.out.println("funcB()");
	}
	
	void infoB() {
		info();
		System.out.println(address);
	}
}