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

public class 함수매개변수도있고반환값있는경우3 { 


	public static void main(String[] args) {
		int result = sum(10,20); //(1)sum이 처음에 인자값을 주고 , (4) return값을 result에 저장한다(이때도 타입을 맞춰야한다)
		System.out.println(result); //int result = return = n1 + n2 = 30
		System.out.println("프로그램 종료!!"); //(5) 실행문 출력
	}
	
	public static int sum(int n1, int n2) { //(2)매개변수를 받는다 / void는 반환값이 없을 떄 사용하는 것이고, 반환값이 있으려면 다른 함수와 return값의 타입을 맞춰준다
		System.out.println("void sum(int n1, int n2) 함수 호출!!"); //(2) 실행문 출력		
		return n1+n2; //(3)return = 값을 반환함, 다시 위로 올라간다 //return은 한 값만 가능
		
		//즉, 처음 인자의 타입 = 매개변수 타입 = return을 받는 반환값의 변수 타입
	}
}
