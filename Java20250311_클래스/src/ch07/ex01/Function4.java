package ch07.ex01;

import java.util.Scanner;

/*
 * 반환X,매개변수X
 */
public class Function4 {

	public static void main(String[] args) {
		
		add();  //return값이 없어서 변수에 저장할 필요가 없음
		System.out.println("name = " );
	}
	
	static void add() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력>>");
		String name = sc.nextLine();
		System.out.println(name);
		//System.out.println(sc.nextLine());
	}
}
