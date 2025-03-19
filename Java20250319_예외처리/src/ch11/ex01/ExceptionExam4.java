package ch11.ex01;

import java.util.Scanner;

public class ExceptionExam4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("합 : " +( num1 + num2));
		System.out.println("뺄셈 : " + (num1 - num2));
		System.out.println("곱 : " + (num1 * num2));
		
		int[] arr = new int[5];
		String str = null;
		
		try { 
			System.out.println("나누기 : " + (num1 / num2));
			//arr[5] = 10;
			System.out.println(str.length());
		} 
			catch(Exception e) { //가장 상위 클래스로 모든 예외를 처리
			System.out.println("예외 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료!");
	}

}
