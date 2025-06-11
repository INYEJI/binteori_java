package ex01;

class A{
	public A() {
		System.out.println("A()........");
	}
}

class B extends A{
	public B() {
		System.out.println("B()........");
	}
}

public class InherTest {

	public static void main(String[] args) {
		B b1 = new B();
	}

}
