package ch04.ex03;

public class BreakEx2 {

	public static void main(String[] args) {

		for(int i=0 ; i<5;i++) {
			for(int j=0; j<5;j++) {
				System.out.print("* ");
				
				if(i == j) { //for문이 i가 1로 들어오면, j로 들어가서 j가 1이 되고 if문을 만족해서 for문(한쪽)을 빠져나감. 그리고 i가 증가해서 2로 들어가서 j가 2가 되고...
					break;
				}
			} System.out.println();
		} 
	}

}
