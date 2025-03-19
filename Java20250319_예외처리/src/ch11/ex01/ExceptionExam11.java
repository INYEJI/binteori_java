package ch11.ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam11 {

	public static void main(String[] args) throws ArithmeticException{
		int result = 0;
		
		result = divide(10,0);
	
		System.out.println(result);
		System.out.println("프로그램 종료!");
	}
	
	
	//함수에서 함수로(main으로) 넘기기
	public static int divide(int num1,int num2) {
		
		if(num2 == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");}
		
			int result = num1/num2;
			return result + 100;
		}
		
	}


