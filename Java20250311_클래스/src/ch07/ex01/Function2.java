package ch07.ex01;
/*
 * 반환O,매개변수O
 */
public class Function2 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1,num2); 
		
		System.out.println("result = " + result);
	}
	
	static int add(int n1, int n2) { //같은 클래스 안이기 때문에 static 붙임(객체 생성 없이 쓰겠다 = 정적멤버)
		return n1+n2;
	}
}
