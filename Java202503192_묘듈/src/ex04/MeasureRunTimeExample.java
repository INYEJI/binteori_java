package ex04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		
		int sum = 0;
		
		long time1 = System.nanoTime();
		
		for(int i=0; i<=1000000000; i++)
			sum += i;
		
		long time2 = System.nanoTime();
		
		System.out.println("합 : " + sum);
		System.out.println("소요시간 : " + (time2 - time1));
	}

}
