package ch04.ex01;

import java.util.Scanner;

public class ForExam4_배열2 {

	public static void main(String[] args) {
		//5명의 점수를 입력 받아서 총점 평균 구하기
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5]; // 배열 선언 = int형 허용크기를 [ ]갯수만큼 이어서 준비, 즉 int형 배열이 5개가 있다
		
		System.out.println("1번 학생 점수 : ");
		num[0] = sc.nextInt();
		
		System.out.println("1번 학생 점수 : ");
		num[1] = sc.nextInt();
		
		System.out.println("1번 학생 점수 : ");
		num[2] = sc.nextInt();
		
		System.out.println("1번 학생 점수 : ");
		num[3] = sc.nextInt();
		
		System.out.println("1번 학생 점수 : ");
		num[4] = sc.nextInt();
		
	
		int sum = num[0] + num[1] + num[2] + num[3] + num[4];
		double avg = sum/5.0;
		System.out.printf("총점: %d, 평균: %.2f\n", sum ,avg);
		
	}
}
