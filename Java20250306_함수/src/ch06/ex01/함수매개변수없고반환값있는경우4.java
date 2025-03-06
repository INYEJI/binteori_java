package ch06.ex01;

/*
 * 함수 ; 4가지의 경우
 * 입력(매개변수) 출력(반환값)
 * 	O   		O
 *  O 			X
 *  X			O
 *  X			X
 *  함수 : 함수를 만드는 것
 *  함수 호출 : 만든 함수를 실행하는 것
 */

public class 함수매개변수없고반환값있는경우4 { 


	public static void main(String[] args) {
		double result = sum(); //(1)매개값과 변수가 없어서 밑으로 이동, (4)result에 return값 저장
		System.out.println(result); 
		System.out.println("프로그램 종료!!"); //(5)출력
	}
	
	public static double sum() { 
		System.out.println("double sum() 함수 호출!!"); //(2)출력
		double pi =3.14159;
		return pi; //(3) return값 -> sum()값으로 감
	}
}
