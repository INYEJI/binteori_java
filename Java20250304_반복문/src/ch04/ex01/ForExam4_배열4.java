package ch04.ex01;

import java.util.Scanner;

public class ForExam4_배열4 {

	public static void main(String[] args) {
		//5명의 점수를 입력 받아서 총점 평균 구하기
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5]; // 배열 선언 = int형 허용크기를 [ ]갯수만큼 이어서 준비, 즉 int형 배열이 5개가 있다 = 5개의 변수값 저장가능
		int sum = 0;
		int i;
		
		for (i=0; i<5; i++) {
			System.out.println(i+1 + "번학생 자바점수 : "); //[]는 0부터 시작
			num[i] = sc.nextInt(); //[i]번째까지 입력 받음
			sum += num[i]; //sum에 num[]값을 i<5까지 누적
		}
		
		double avg = sum/(i);
		System.out.printf("총점: %d, 평균: %.2f\n", sum ,avg);
		
	}
}
