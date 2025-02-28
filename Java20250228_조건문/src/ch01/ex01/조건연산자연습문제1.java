package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		//String result = (kor>=70) ? "합격" : "불합격"
		//System.out.print(result);
		
		if(kor>=70) { 
			System.out.println("합격");
		} else {
		System.out.println("불합격");
		}
	}

}

	// String result = (kor>=80) ? "상" : (kor>=60) ? "중" : "하" ; 조건이 2가지 일 때
	// System.out.println(result);