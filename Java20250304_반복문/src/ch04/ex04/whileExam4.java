package ch04.ex04;

import java.util.Scanner;

public class whileExam4 {

	public static void main(String[] args) {
		
		int i = 2;
		
		while(i<=9) { //탈출조건이 없으면 무한반복하기때문에 꼭 break나 탈출문을 넣어줘야한다
			int j = 1;
			System.out.printf("%d단\n" , i);
			while(j<=9) {
				System.out.printf("%dx%d=%d\n" , i, j , i*j);
				j++;
			} System.out.println();
			
			i++;
		}
	
	} 
	}



