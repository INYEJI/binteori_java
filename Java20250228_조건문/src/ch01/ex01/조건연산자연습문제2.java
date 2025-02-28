package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
			
		
		if(kor>=70&&eng>70) { 
			System.out.println("합격");
		} else {
		System.out.println("불합격");
		}
	}

	}
