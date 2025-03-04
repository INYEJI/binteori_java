package ch04.ex01;

public class ForExam3 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<=100 ; i++) { //1부터 100까지 반복
			if(i%2 == 1) { //홀수인지묻는중 i를 2로 나눴을 때 나머지가 1임 = 홀수
				sum += i; //홀수이면 누적
			}
		}
		System.out.println("sum = " + sum);
	}
}
