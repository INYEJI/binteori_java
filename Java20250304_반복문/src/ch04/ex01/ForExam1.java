package ch04.ex01;

public class ForExam1 {

	public static void main(String[] args) {

		/*
		 * 반복문
		 * for,while : 조건을 만족할 때까지 계속 반복
		 * for : 반복 횟수를 알 때
		 * while : 몇 번 반복하는 지 모를 때
		 * do-while : 조건을 만족할 때까지 계속 반복(단, 최소 1회는 보장)
		 */
		
		int sum = 0;
		
		for(int i=1; i<=5; i++) { //for(초기값, 조건식, 증감식) => 조건이 맞을 경우 밑의 실행문 실행 후 증감식으로 반복 false일때 for문 종료, 초기값은 진입 후 딱 1회만 진행
			sum += i;
		}
			System.out.println("sum = " + sum);		
		
	}

}
