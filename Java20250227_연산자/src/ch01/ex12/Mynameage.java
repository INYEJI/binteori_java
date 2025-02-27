package ch01.ex12;

import java.util.Scanner;

public class Mynameage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		//String a = name; 
		//System.out.println("이름 : " + name);
		
		System.out.println();
		
		//sc.nextLine(); 버퍼 클리어 = 버퍼에 입력된 값(엔터도 포함)이 잠시 저장되는데 그것을 비워줘야함
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		//int b = age;
		//System.out.println("나이 : " + age + "살");
		
		System.out.println();
		
		System.out.printf("이름 : %1$s, 나이 : %2$d", name, age); //("이름 : %1$s, 나이 : %2$d", a , b)

	}

}
