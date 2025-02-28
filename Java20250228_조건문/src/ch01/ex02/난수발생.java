package ch01.ex02;

public class 난수발생 {

	public static void main(String[] args) {
	
		System.out.println((int)(Math.random()*6)+1);//원래 0과 1사이 랜덤으로 난수 발생 // 곱하고 더하는 건 갯수를 위해 int형은 정수로 바꾸기 위함
		
		
		System.out.println((int)(Math.random()*6));//0~5 정수
		System.out.println((int)(Math.random()*6)+1);//1~6 정수

		//수학과 관련된 것
		
		System.out.println( Math.PI); //파이
		System.out.println(Math.abs(-1)); //절대값
		System.out.println(Math.sqrt(4)); //루트
		System.out.println(Math.floor(12.33));//소수점이하 절삭
		
		
	}

}
