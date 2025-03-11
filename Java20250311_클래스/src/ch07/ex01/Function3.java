package ch07.ex01;

import java.util.Scanner;

/*
 * 반환O,매개변수X
 */
public class Function3 {

	public static void main(String[] args) {
		
		String result = add(); //매개변수가 없고, 여기에 반환값이 들어감
		System.out.println("name = " + result);
	}
	
	static String add() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력>>");
		String name = sc.nextLine();
		return name; //반환	
		//return sc.nextLine(); 변수를 사용하지 않고 바로 입력받은 값을 리턴
	}
}
