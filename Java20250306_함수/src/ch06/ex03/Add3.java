package ch06.ex03;

/*
 * 2개 값을 입력 받아서, 더하는 기능 수행
 * 매개변수X,반환O
 */
public class Add3 {

	public static void main(String[] args) {
		
		System.out.println("main함수 시작");
		
		
		int result = add(); //함수선언,매개변수X ()가 빈칸
		System.out.println(result);

		System.out.println("프로그램 종료");

	}
		public static int add() { //위의 add()빈칸에 sum이 들어갈 수 있게 반환값 작성, 매개 변수 없으므로 int add()
			
			int num1 = (int)(Math.random()*100)+1; 
			int num2 = (int)(Math.random()*100)+1;
			
			System.out.println(num1);
			System.out.println(num2);
			
			int sum = num1 + num2;
			return sum; //반환값
		}
	
}
