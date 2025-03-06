package ch04.ex01;

public class 정렬 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10]; //배열 값 0으로 셋팅, numArr에 0부터 9까지 10개의 값이 들어있는 것
		int tmp;
		
		//System.out.println((int)(Math.random()*100)+1); 랜덤 값 추출(1부터 100까지)
		
		//랜덤하게 1~100 사이의 값을 배열에 넣는다
		for(int i =0; i<10; i++ ) {
			tmp = (int)(Math.random()*100)+1;
			numArr[i] = tmp;
		}
		
		//랜덤하게 배열 저장된 값 출력
		for(int i=0; i<10; i++ ) {
			System.out.print(numArr[i] + " ");
		}
	}

}
