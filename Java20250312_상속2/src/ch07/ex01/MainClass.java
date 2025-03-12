package ch07.ex01;
/*
 * 상속전제조건
 * 하위 클래스는 상위클래스 자원 접근 가능(private 제외)
 * 상위 클래스는 하위클래스 접근 불가, 자신의 클래스에만 접근 가능
 * 상위 클래스는 하위클래스를 참조할 수 있다
 */
public class MainClass {

	public static void main(String[] args) {

		C c1 = new C("지리산","전북남원",40);
		c1.funcA();
		c1.funcB();
		c1.funcC();
		
		B b1 = new B("남산","서울");
		b1.funcA();
		b1.funcB(); //B는 하위클래스인 C 접근 불가
		
		A a1 = new A("내장산");
		a1.funcA(); //A만 접근 가능
		System.out.println("----자동타입변환------");
		
		A a2 = new B("치악산","원주");
		a2.funcA();
		//a2.funcB()는 접근불가(하위클래스이기 때문)
		
		A a3 = new C("한라산","제주",31); //참조는 가능
		a3.funcA();
		
		//B b2 = new B("치악산","원주");
		//A a2 = (A)b2;
		
		
		System.out.println("---------강제 타입 변환 -----------");
	
		A a4 = new B("백두산","함경북도");
		B b2 = new B("백두산","함경북도");
		
		
		//1.강제 변환 불가능
		A a5 = new A();
		B b3 = new B();
		b3 = (B)a5;  //변환을 거치지 않고 강제 변환하는 건 불가능
		
		//2.강제 변환 가능
		A a6 = new B();
		B b4 = new B();
		b4 = (B)a6;
		
		
		A a7 = new C();
		B b5;
		b5 = (B)a7;
		
		A a8 = new C();
		C c2 = (C)a8;
		
		
		A a10 = new A();
		B b6 = new B();
		a10 = b6;
		B b7 = (B)a10;
		

	}

}
