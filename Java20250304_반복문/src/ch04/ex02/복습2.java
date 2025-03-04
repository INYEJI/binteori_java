package ch04.ex02;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		/* <자료형>
		 * 정수 : byte, short, char, int, long
		 * 실수 : float, double
		 * 논리 : boolean
		 */
		
		//객체 참조변수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt(); //int로 받음
		
		//삼항연산자
		String str = (num>0) ?  "양수" : "음수"; 
		System.out.println(str);
	
		
		//if문
		if(num>0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}	

	}

}
