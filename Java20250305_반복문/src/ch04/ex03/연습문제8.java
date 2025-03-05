package ch04.ex03;

import java.util.Scanner;

public class 연습문제8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int[] score = null;
		int num = 0;
		int mem = 0;
		int sum = 0;
		int max = 0;

		
		while(flag) {
		System.out.println("--------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
	
		System.out.print("선택>");
		num = Integer.parseInt(sc.nextLine());
	
		if(num==1) 
			{ System.out.print("학생수>");
			mem = Integer.parseInt(sc.nextLine());
			score = new int[mem]; }
		
		else if(num==2)
			{for(int i=0 ; i<score.length; i++) {
				System.out.printf("score[%d] >" , i);
				score[i] = Integer.parseInt(sc.nextLine());} }
		
		else if(num==3) 
			{for(int i=0 ; i<score.length; i++) {
				System.out.println("score[" + i + "]: "+ score[i]);}}
			
		else if(num==4)
		{{for(int i=0; i<score.length; i++) {
				sum += score[i]; 
			if(score[i] >max) {
				max = score[i]; }} 
		int avgg = sum/score.length; 
		System.out.println("최고 점수" + max);
		System.out.println("평균 점수" + (double)avgg);}}
		else if(num==5) 
		{flag = false;}
		} System.out.println("프로그램 종료");

	}
	
}
