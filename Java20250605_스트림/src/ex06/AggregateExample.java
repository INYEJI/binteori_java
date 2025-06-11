package ex06;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateExample {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		int[] arr = {};
		
		long count = Arrays.stream(arr)
				.filter(n -> n%2==0)
				.count();
		System.out.println("2의 배수 : " + count);
		
		int sum = Arrays.stream(arr)
				.filter(n->n%2==0)
				.sum();
		System.out.println("총합 : " + sum);
		
		/*
	    double avg =  Arrays.stream(arr)
						.filter(n->n%2==0) // 2,4,6,8,10 => avg 5.0
						.average().getAsDouble(); //double 반환
	    System.out.println("avg : " + avg);
	    
	    */
	    
		
	     
	    OptionalDouble avg2 =  Arrays.stream(arr)
								.filter(n->n%2==0) // 2,4,6,8,10 => avg 5.0
								.average();
	    if(avg2.isPresent()) {
	    	System.out.println(avg2.getAsDouble());
	    }else {
	    	System.out.println("평균 구할수 없음..");
	    }
	     
	     
	    OptionalDouble avg3 = Arrays.stream(arr)
			.filter(n->n%2==0) // 2,4,6,8,10 => avg 5.0
			.average();
	    
	    double result = avg3.orElse(0.0);
		System.out.println(result);
		
		
		
	}

}