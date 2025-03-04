package ch04.ex01;

import java.util.Scanner;

public class ForExam4_배열 {

	public static void main(String[] args) {
		//5명의 점수를 입력 받아서 총점 평균 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 점수를 입력하세요");
		int a = sc.nextInt();
		
		System.out.println("b의 점수를 입력하세요");
		int b = sc.nextInt();
		
		System.out.println("c의 점수를 입력하세요");
		int c = sc.nextInt();
		
		System.out.println("d의 점수를 입력하세요");
		int d = sc.nextInt();
		
		System.out.println("e의 점수를 입력하세요");
		int e = sc.nextInt();
		
		int sum = a + b + c + d + e;
		
		double avg = sum/5.0;
		System.out.printf("총점: %d, 평균: %.2f\n", sum ,avg);
		
	}
}
