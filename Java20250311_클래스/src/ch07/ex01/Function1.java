package ch07.ex01;
/*
 * 반환O,매개변수O
 */
public class Function1 {

	public static void main(String[] args) {
		
		Function1 f1 = new Function1(); //객체 생성
		
		int num1 = 10;
		int num2 = 20;
		
		int result = f1.add(num1,num2); //main class에서 함수(메소드) 호출시 객체 생성 먼저
		
		System.out.println("result = " + result);
	}
	
	int add(int n1, int n2) {
		return n1+n2;
	}
}
