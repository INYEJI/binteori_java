package ch04.ex02;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		
		//객체 참조변수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt(); //int로 받음
		
		//삼항연산자 조건이 여러개 일 때
		//(조건1) ? : 참 : ((조건2) ? : 참 : 거짓);
		String str = (num>0) ?  "양수" : ((num<0) ? "음수" : "0");
		System.out.println(str);
	
		
		//if문
		if(num>0) {
			System.out.println("양수");
		} else if(num<0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}

		//String msg = "";
		//if(num > 0) {
		//	msg = "양수";
		//} else {
		//	msg = "음수";
		//}
		//System.out.println(msg);
		
	}

}

//실행문장이 하나일 경우엔 중괄호 생략 가능