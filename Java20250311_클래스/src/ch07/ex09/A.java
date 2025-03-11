package ch07.ex09;

public class A {
	private String name; 

	A(){}
	
	A(String name){
		this.name = name;
	}
	
	void test() {
		System.out.println("A");
	}
}
class B extends A {
	private String address;
	
	B(){}
	
	B(String name, String address) {
		super(name);
		//this.name = name;
		this.address = address;
	}
	
	@Override //어노테이션
	void test() {
		System.out.println("B");
	}
}
class C extends B {
	private int age;
	
	C(){}
	
	C(String name,String address,int age){
		super(name,address); //상위의 생성자를 불러줌
		//this.name = name;
		//this.address = address; 이미 상위 클래스에서 작성했기 때문에 작성X
		this.age = age;
	}
	
	
	@Override //어노테이션
	void test() {
		super.test(); //상위 메소드 호출
		System.out.println("C");
	}
	
	
	public void info() {
		//System.out.println("name : " + name); //private는 같은 객체 내에서만 사용 가능
		//System.out.println("address : " + address);
		System.out.println("age : " + age);
	}
	
}
