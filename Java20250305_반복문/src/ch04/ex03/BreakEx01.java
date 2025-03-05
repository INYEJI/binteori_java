package ch04.ex03;

public class BreakEx01 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		for(i=0;i<=100;i++) {
			sum += i;
			if(sum >= 2000) {
				break; //반복문 1개를 벗어남
			}
		}
		System.out.println(sum);
		System.out.println(i);
	}

}
