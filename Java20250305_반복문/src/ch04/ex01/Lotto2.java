package ch04.ex01;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		
		/*
		 * 로또 프로그램
		 * 배열 : int형 배열 6개
		 * 1부터 45까지 랜덤하게
		 * 단 중복 불가능
		 */
		
		Random random = new Random();	
		int[] lotto = new int[45];
		
		for (int j=0; j<5; j++) { //5번 출력하고 싶을 때 가장 바깥의 for문을 5회 돌게 한다.
		for(int i=0; i<lotto.length; i++) 
			lotto[i] = i+1;
		
		//배열 섞기
		for(int i=0; i<500; i++) {
			int index = (int)(Math.random()*45);		
			int zxy = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = zxy;
		}
		//배열 45개 칸 중 앞자리 6자리만 출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");		
		} System.out.println();
	}
}
}



