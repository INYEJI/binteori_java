package ch11.ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam12 {

	public static void main(String[] args) throws FileNotFoundException{

		FileInputStream fis = new FileInputStream("./src/ex01/test.txt"); //test 텍스트파일의 경로
	
		System.out.println("프로그램 종료!");
	}
	
	}


