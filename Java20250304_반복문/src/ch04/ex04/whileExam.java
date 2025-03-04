package ch04.ex04;

public class whileExam {

	public static void main(String[] args) {
		
		/*int sum = 0;
		for(int i=1; i<=5; i++) { 
			sum += i;
			}
			System.out.println("sum = " + sum);	
			*/
		
		int sum = 0;
		int i=1; //초기값
		
		while(i<=5) { //조건이 참일때만 반복(i가 5보다 작거나 같을때까지)
			sum +=i; //실행문 실행
			i++;
		}
		System.out.println("sum = " + sum);
	}

}
