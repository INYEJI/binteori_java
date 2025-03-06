package ch06.ex03;

/*
 * 2개 값을 입력 받아서, 더하는 기능 수행
 * 매개변수X,반환X
 */
public class Add1 {

	public static void main(String[] args) {
		
		System.out.println("main함수 시작");
		
		add(); //함수만..

		System.out.println("프로그램 종료");

	}
		public static void add() { //매개변수X,return값X
			
			int num1 = (int)(Math.random()*100)+1;
			int num2 = (int)(Math.random()*100)+1;
			
			
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2) );
			System.out.println("add() 시작");
		}
	
}
