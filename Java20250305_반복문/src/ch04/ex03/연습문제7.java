package ch04.ex03;

import java.util.Scanner;

public class 연습문제7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		
		while(true) {	
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");

		System.out.print("선택>");
		//문자열을 정수형으로 전환
		int num = Integer.parseInt(sc.nextLine());
		int cash = 0;
		
		switch(num) {
		case 1:
			System.out.print("예금액>");
			cash += Integer.parseInt(sc.nextLine());
			break;
		case 2:
			System.out.print("출금액>");
			cash -= Integer.parseInt(sc.nextLine());
			break;
		case 3:
			System.out.print("잔고>");
			System.out.println(cash);
			break;
		case 4:
			flag = false;
			System.out.println("프로그램 종료");
			break;
		}
		
		}

	}
		
	}
	
