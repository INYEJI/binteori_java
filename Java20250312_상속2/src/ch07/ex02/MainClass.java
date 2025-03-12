package ch07.ex02;
/*
 * 상속전제조건
 * 하위 클래스는 상위클래스 자원 접근 가능(private 제외)
 * 상위 클래스는 하위클래스 접근 불가, 자신의 클래스에만 접근 가능
 * 상위 클래스는 하위클래스를 참조할 수 있다
 */
public class MainClass {

	public static void main(String[] args) {

		A a1 = new A();
		a1.test();
		
		B b1 = new B();
		b1.test();
		
		C c1 = new C();
		c1.test();
		
		System.out.println("--------다형성---------");
		
		A a2 = new C(); //메소드가 오버라이딩 되었을 경우 자식객체가 갖고 있는 것이 출력된다.
		a2.test();
		
		A a3 = new B();
		a3.test();
		
		B b2 = new C();
		b2.test();
		
	

	}

}
