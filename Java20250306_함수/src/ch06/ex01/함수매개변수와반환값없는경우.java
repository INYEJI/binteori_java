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

public class 함수매개변수와반환값없는경우 { //값 전달이 없음.

	//(1)main함수 먼저, 진입점(반드시)
	public static void main(String[] args) {
		sum(); //(2)함수 호출 -> (3)void sum() 함수로 간다
		System.out.println("프로그램 종료!!"); //(5)되돌아와서 실행
	}
	
	//함수 정의
	public static void sum() {
		//코드 구현
		System.out.println("void sum() 함수 호출!!"); //(4)실행 후 다시 호출했던 문장으로 돌아감
	}
}
