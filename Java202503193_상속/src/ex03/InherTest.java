package ex03;

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

	public B(int num, int age, String name) {
		super(name, num);
		this.age = age;
	}
	
}

public class InherTest {

	public static void main(String[] args) {
		B b1 = new B(100, 20, "홍길동");
		System.out.println(b1.num);
		System.out.println(b1.age);
		System.out.println(b1.name);
	}

}
