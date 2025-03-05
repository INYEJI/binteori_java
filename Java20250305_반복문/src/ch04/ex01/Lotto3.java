package ch04.ex01;

import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		
		/*
		 * 로또 프로그램
		 * 배열 : int형 배열 6개
		 * 1부터 45까지 랜덤하게
		 * 단 중복 불가능
		 */
		
		Random random = new Random();	
		int[] lotto = new int[6]; //6칸 자리 방에
		boolean flag = false;
		
		for(int i = 0; i<lotto.length; i++) {
			
			int temp = (int)(Math.random()*45+1); //랜덤으로 값 넣을 거
			
			//중복체크과정
			for(int j=0; j>lotto.length; j++) {
				if(temp == lotto[j]) { //(1)만약 랜덤 숫자가 == lotto[j] 이면 
					flag = true; //flag값이 true로 바뀌고
					break;//멈춘다음에			
				}
			}	if(flag != true) { //중복되지 않았을 때 처리 (2)랜덤숫자가 lotto[j]랑 같지 않으묜..
				lotto[i] = temp;
			}else {//중복된 경우에 처리
				i--; //i가 하나 감소하고
				flag = false; //위로 되돌아간다 true값으로 변경된 값을 원 상태로 변경(false)
			}
		}
		//출력
		for(int i=0; i<lotto.length; i++) { //여기 for문으로 들어오라
			System.out.print(lotto[i] + " ");
		}	
	}
}



