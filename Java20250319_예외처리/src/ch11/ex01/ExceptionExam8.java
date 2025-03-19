package ch11.ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam8 {

	public static void main(String[] args) {

		int result = divide(10,2);
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}
	
	
	//함수 직접 처리 한 경우
	public static int divide(int num1,int num2) {
		int result = 0;
		try {
			result = num1/num2;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
