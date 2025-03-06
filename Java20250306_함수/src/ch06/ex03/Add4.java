package ch06.ex03;

import java.util.Scanner;

/*
 * 2개 값을 입력 받아서, 더하는 기능 수행
 * 매개변수O,반환O
 */
public class Add4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //힙이란 공간을 만들어줌, 여기에 객체((데이터=필드)+메소드) 생성 => 객체번지 O
		//sc.nextline() = 스택 영역에 참조타입 변수 생성  . (도트)가 객체 접근 연산자임 = 객체 번지 참조
		
		
		
		System.out.println("main함수 시작");
		
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		int result = add(num1,num2); //add 함수 선언 이전에는 그냥 흐름대로 실행, 함수(매개변수O)
		
		System.out.println("result = " + result);

		System.out.println("프로그램 종료");
	}
		
		public static int add(int n1, int n2) { //add num1 = int n1, add num2 = int n2
			
			int sum = n1 + n2;
			return sum; //반환값O
			
		}
	
}
//매개변수 없을 때 함수() 빈칸 선언
//매개변수 있을 때 밑에 void타입 X
//반환값 = return 1개 값 전달
