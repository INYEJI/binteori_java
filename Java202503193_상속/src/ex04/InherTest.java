package ex04;

class A{
	int num;
	String name;
	
	public A() {
		System.out.println("A()........");
	}

	public A(String name, int num ) {
		this.num = num;
		this.name = name;
	}
}

class B extends A{
	int age;
	
	public B() {
		System.out.println("B()........");
	}

	public B(int age,  String name, int num) {
		super(name, num);
		this.age = age;
	}
	
}

public class InherTest {

	public static void main(String[] args) {
	//	A a1 = new A("AAA", 10);
		A a1 = new B(10, "AAA", 20);
		
		System.out.println(a1.name);
		System.out.println(a1.num);
//		System.out.println(a1.age);
	}

}
