package ch04.ex04;

public class whileExam2 {

	public static void main(String[] args) {
	
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			if(i%2 == 1) {
				sum += i;
			} i ++;
		} System.out.println(sum);
	} 

}

/*	int sum = 0;
	for(int i=1; i<=100 ; i++) { 
	if(i%2 == 1) {
		sum += i;
		}  System.out.println(sum);
*/