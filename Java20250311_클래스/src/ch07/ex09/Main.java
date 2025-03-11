package ch07.ex09;

public class Main {

	public static void main(String[] args) {

		C c1 = new C("치악산","강원도",100);
		c1.info();
		
		c1.test();
		
		B b1 = new B("내장산","전북");
		b1.test();
		
		A a1 = new A("지리산");
		a1.test();

	}

}
