package ch04.ex03;

public class 중첩for문 {

	public static void main(String[] args) {
		/*
		 *  {10,-3,-700,1,2,9,3}
		 *  
		 *  정렬(sort)해서 출력하기
		 */
		
		//for (int i = 0 ; i<5 ; i++) { //0부터 4까지 ->이 방향으로(행) 
			//for(int j = 0  ; j<5; j++) { //0부터 4까지 아래 방향으로(열) 
			//System.out.print("* ");
		//} System.out.println();
	//}
		
		
		for(int a=0; a<5; a++) {
		 for(int b=0; b<5-a; b++) {
			System.out.print("+ ");
		 }
		  System.out.println();
		}
   }
}