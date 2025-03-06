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

public class 함수매개변수는있고반환값없는경우2 { 

//인자값이 있을 경우에는 매개변수가 반드시 존재해야함
	public static void main(String[] args) {
		sum(10,20); //(1)전달되는 값 = 인자값
		System.out.println("프로그램 종료!!"); //(5)다시 돌아와서 출력
	}
	
	public static void sum(int num, int num2) { //(2)int num에 100저장(매개변수), 인자값과 매개변수의 타입과 갯수, 순서를 맞추자
		System.out.println("void sum() 함수 호출!!"); //(3)출력
		System.out.println(num+num2); //(4)값 출력
	}
}
