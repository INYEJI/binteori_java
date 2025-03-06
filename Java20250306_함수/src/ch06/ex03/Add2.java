package ch06.ex03;

/*
 * 2개 값을 입력 받아서, 더하는 기능 수행
 * 매개변수O,반환X
 */
public class Add2 {

	public static void main(String[] args) {
		
		System.out.println("main함수 시작");
		
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		
		add(num1,num2); //함수선언

		System.out.println("프로그램 종료");

	}
		public static void add(int numA, int numB) { //매개변수O,return값X 이므로 void, numA = num1, numB = num2
			
			System.out.println(numA + "+" + numB + "=" + (numA+numB) ); //여기서 출력
			System.out.println("add() 시작");
		}
	
}
