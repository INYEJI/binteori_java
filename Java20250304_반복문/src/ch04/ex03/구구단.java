package ch04.ex03;

public class 구구단 {

	public static void main(String[] args) {

		//구구단 출력, 몇 번 반복하는 지 알 때
		
		for(int i=2; i<=9; i++) { //i가 2일때 => 안의 for문을 다 했으면 다시 i=3 .... i<=9일때까지 반복한다
			System.out.printf("******%d단출력******\n" , i); //"2단 출력" 코멘트 출력
			for (int j=1; j<=9; j++) { //j가 i부터 9일때까지 반복 실행 => 끝나면 다시 바깥 for문으로
				System.out.printf("%dx%d=%d\n", i,j,i*j);
			}
			System.out.println();
		}

	}

}
