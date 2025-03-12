package ch07.ex02;

public class A {
	private String name;
	
	A(){}
	A(String name){
		this.name = name;
	}
	void test() {
		System.out.println("A class");
	}
	void funcA() {
		System.out.println("funcA()");
	}
}

class B extends A{
	private String address;
	
	B(){}
	B(String name,String address){
		super(name);
		this.address = address;
	}
	void funcB() {
		System.out.println("funcB()");
	}
	@Override
	void test() {
		System.out.println("B class");
	}
}

class C extends B{
	private int age;
	
	C(){}
	C(String name, String address, int age){ //매개변수와 필드명은 달라도 상관없음
		super(name,address);
		this.age = age;
	}
	void funcC() {
		System.out.println("funcC()"); //C의 경우 A와 B의 메소드에 접근 가능
	}
	@Override
	void test() {
		System.out.println("C class");
	}
}
