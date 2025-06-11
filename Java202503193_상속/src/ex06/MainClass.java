package ex06;

class A{
	void fa() {
		System.out.println("A class");
	}
	
	void fc() {
		System.out.println("AC class");
	}
}

class B extends A{
	void fb() {
		System.out.println("B class");
	}
}

class C extends B{
	void fc() {
		System.out.println("C class");
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		C c1 = (C)a3;
		//C c2 = (C)a2; //error발생
		B b1 = (B)a2;
		
		a1.fc();
		a2.fc();
		a3.fc();

	}

}
