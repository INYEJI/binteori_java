package ch04.ex01;

public class ForExam2 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=100; i>=50 ; i--) { //초기화 값부터 조건식까지 => 범위
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
