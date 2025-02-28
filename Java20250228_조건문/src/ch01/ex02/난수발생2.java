package ch01.ex02;

import java.util.Random;

public class 난수발생2 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		
		System.out.println(ran.nextInt(6)+1);
		
		System.out.println(ran.nextDouble(12));
		
	}
	

}
