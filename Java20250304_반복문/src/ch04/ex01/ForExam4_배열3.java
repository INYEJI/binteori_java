package ch04.ex01;

import java.util.Scanner;

public class ForExam4_배열3 {

	public static void main(String[] args) {
		//7명 학생 점수 입력 받고 총점과 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[7];
		int sum = 0;
		int i;
		
		for(i=0 ; i<7 ; i++) {
			System.out.println( i+1 + "번 학생의 점수 : ");
			num[i] = sc.nextInt();
			sum += num[i];
		} 
		double avg = sum/i;
		System.out.printf("총점:%d , 평균:%.2f\n" , sum, avg);
	} 
	
	
}
