package ch04.ex02;

import java.util.Scanner;

public class 복습4 {

	public static void main(String[] args) {
		//1부터 5까지의 합
		int sum = 0; //합계 변수
		int i; //카운터 변수(몇 번 for문을 돌았는지)
		
		for(i=1; i<=5; i++) { //for(초기화식 ; 조건식 ; 증감식) i=1부터, =<5까지 실행문을 실행, 증감식으로 가서 i가 1씩 증가(조건식이 틀릴때까지 반복)
			sum  += i;
		}
		System.out.println("sum : " + sum + ", i : " + (i-1));

		
	}

}

//함수 main (지역변수)
//public static void main(String[] args) {
//} =>변수는 main 안에서 사용 가능

//main안의 { }이 있을 경우 { }에 변수 선언(블럭변수)하면 { }안에서만 사용가능

//함수 func
//public static void func() {
//	int a = 0;
//}