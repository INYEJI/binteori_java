package ch04.ex01;

import java.util.Scanner;

public class ForExam4 {

	public static void main(String[] args) {
		/*
		 * 키보드 숫자 입력 받는다.
		 * 5 -> 1~5 누적합
		 * 10 -> 1~10 누적합
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int i = sc.nextInt();
		int num = 0;
		int sum = 0; //변수 선언 -> 값 초기화
		
		for(num=1; num<=i ; num++) {
			//if(num%2 == 1) 홀수값만 출력하고 싶을 때 혹은 if (num=1 ; num<=i; num=num+2 or num+=2) num이 1부터 2씩 증가
			sum += num;
		}
		System.out.println(sum);
	}

}
