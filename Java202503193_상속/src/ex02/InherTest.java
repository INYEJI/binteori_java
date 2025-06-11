package ex02;

class A{
	int num;
	
	public A() {
		System.out.println("A()........");
	}

	public A(int num) {
		this.num = num;
	}
}

class B extends A{
	public B() {
		System.out.println("B()........");
	}

	public B(int num) {
		super(num);
	}
	
}

public class InherTest {

	public static void main(String[] args) {
		B b1 = new B(100);
		System.out.println(b1.num);
	}

}
