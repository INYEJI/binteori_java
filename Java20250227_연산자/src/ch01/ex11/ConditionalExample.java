package ch01.ex11;

import java.util.Scanner;

public class ConditionalExample {

	public static void main(String[] args) {
		// 삼항 연산자(조건 연산자)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		
		int num = sc.nextInt();
		
		//String result = num > 0? "양수입력함" : "음수입력함" ; // 조건식 ? 값,연산식(조건이 true일 때 출력) : 값,연산식(조건이 false일 때 출력)
		
		//절대값으로 출력하고 싶으면
		int result = (num > 0) ? num : -num ;
		
		System.out.println(result);
	}

}
