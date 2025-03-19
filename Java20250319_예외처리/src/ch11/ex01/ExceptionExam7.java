package ch11.ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam7 {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("file.txt")) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료!");
	}

}
