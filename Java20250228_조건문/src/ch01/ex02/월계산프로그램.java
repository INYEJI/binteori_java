package ch01.ex02;

import java.util.Scanner;

public class 월계산프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");		
		int month = sc.nextInt();
		
		if(month>=3 && month<=5) {
			System.out.println("봄");
		}else if(month>=6 && month<=8) {
			System.out.println("여름");
		}else if(month>=9 && month<=11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}

	}

}

//if(month == 1 || month == 2 || month == 3) 이런식으로 해도 됨
//중첩 if문은 가급적 쓰지 않도록 하고 else if와 else를 사용하는 게 가독성이 좋음.