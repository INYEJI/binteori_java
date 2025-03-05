package ch04.ex02;

public class DoWhile01 {

	public static void main(String[] args) {
		// do-while : 조건이 참이든 거짓이든 1번은 실행함
		int sum = 0;
		int j = 0; //초기값
		
		do {
			j++; //증가값, 변동값
			sum += j;
		} while(j<100); //조건
		System.out.println();
	}

}
