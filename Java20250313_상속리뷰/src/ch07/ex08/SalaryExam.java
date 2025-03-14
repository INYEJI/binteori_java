package ch07.ex08;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("월 정보를 입력해주세요.");
		int month = sc.nextInt();
		System.out.println("등급 정보를 입력해주세요.");
		int grade = sc.nextInt();
		
		if(month%2==0) {
			SalaryExpr se = new SalaryExpr(100);
			int result = se.getSalary(grade);
			System.out.println(month+"월 "+grade+"등급의 월급은 " +result+"입니다");
			}else {
				SalaryExpr se = new SalaryExpr(0);
				int result = se.getSalary(grade);
				System.out.println(month+"월 "+grade+"등급의 월급은 " +result+"입니다");
			}
		

	}

}
