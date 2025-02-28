package ch01.ex02;

import java.util.Scanner;

public class ifExam4 {

	public static void main(String[] args) {
		
		/*버스요금 계산 프로그램
		 * 기본요금 :2000
		 * 1-5세 : 무료 0 원
		 * 6-12세 : 50%할인 = 1000원
		 * 13~18세 : 25%할인 = 1500원
		 * 19~64세 : 할인X = 2000원
		 * 65세 이상 : 무료 0원
		 */
			
		Scanner sc = new Scanner(System.in);
		int age = 0;
		int fee = 2000; //버스요금 
		double rate = 0; //할인율
		
		System.out.print("나이 입력:");
		age = sc.nextInt();
		
		//위에서 아래로 순차적 진행
		if(age>=65 || age <=5) {
			rate = 0;
		}else if(age>=6 && age<=12) { 
			rate = 0.5; 
		}else if(age>=13 && age<=18) {
			rate = 0.75;
		}else if(age>=19 && age<=64) {
			rate = 1;
		}
		
		fee = (int)(fee*rate);
		
		System.out.println("버스 요금 : " + fee + " 원 입니다.");
		
		System.out.println("종료");
		}
		}
		