package ch07.ex08;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("데이터의 갯수를 입력해주세요");
		int n = sc.nextInt();
		int[] arr = new int[n]; //데이터 갯수 몇 개
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("점수들을 입력해주세요");
			arr[i] = sc.nextInt(); //그 갯수만큼 돌아간다
		}
		
		for(int i = 0; i<arr.length; i++) { //그 점수 분리해서 출력
			System.out.print(arr[i] + ",");
		}
		
		System.out.println();
	
		GradeExpr ge = new GradeExpr(arr);
		int sum = ge.getTotal();
		System.out.println("총점 : "+ sum);
		double avg = ge.getAverage();
		System.out.println("평균 : " + avg);
		int best = ge.getGoodScore();
		System.out.println("최고 점수 : " + best);
		int bad = ge.getBadScore();
		System.out.println("최저 점수 : " + bad);
		
		
	}

}
