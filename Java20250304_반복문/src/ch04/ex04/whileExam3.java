package ch04.ex04;

import java.util.Scanner;

public class whileExam3 {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int i = sc.nextInt();
		
		int num = 0;
		int sum = 0;
		 
		for(num=1; num<=i ; num++) {
			if(num%2 == 1) {
			sum += num;
			}
		} System.out.println(sum);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int i = 1; //초기값
		int sum = 0;
		
		while(i<=num) {
			if(i%2 == 1) {
				sum += i;
				i ++;
			} System.out.println(sum);
	} 
	}
}


