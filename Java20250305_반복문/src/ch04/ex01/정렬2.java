package ch04.ex01;

import java.util.Random;

public class 정렬2 {

	public static void main(String[] args) {
		
		
		//int seed = 1235; //시드 값에 따라 random 숫자가 일정하게 나옴
		//Random random = new Random(seed);//random.nextInt()를 사용하려면 이 문장을 써야함
		
		Random random = new Random(); //시드값이 없으면 랜덤하게 추출(매번바뀜)
		
		int[] numArr = new int[10];
		int tmp;
		
		//System.out.println((int)(Math.random()*100)+1); 랜덤 값 추출(1부터 100까지)
		
		//랜덤하게 1~100 사이의 값을 배열에 넣는다
		for(int i =0; i<numArr.length; i++ ) { //numArr.length 랜덤길이값(인덱스가 몇 개인지)
			tmp = (int)random.nextInt(100) + 1;
			numArr[i] = tmp;}
		
		
		//랜덤하게 배열 저장된 값 출력
		for(int i=0; i<numArr.length; i++ ) 
			System.out.print(numArr[i] + " ");
			
			System.out.println();
			System.out.println();
			
			//최대값, 최솟값 출력
			
			int max;
			int min;			
			max = numArr[0];
			min = numArr[0];
			
			for(int i=1;i<numArr.length;i++) { //i가 1부터인 이유는 이미 앞에서 [0]이 들어간 값으로 임의지정했기때문이다
				if(max < numArr[i]) {
					max = numArr[i];}
				if(min > numArr[i]) {
					min = numArr[i]; }
				} 
			System.out.println("최대값: " + max + ", 최소값:" + min);
		
			System.out.println();
			
			//총점, 평균
			int sum = 0;
			double avg = 0;
			
			for(int i=0;i<numArr.length;i++) 
				sum += numArr[i];
			
			avg = (double)sum / numArr.length;
			System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
				
			
			System.out.println();
			
			
			
			//정렬(버블정렬)
			
			int temp;
			for (int i=0; i<numArr.length; i++) { //계속 도는 용도(1번 돌 때마다 제일 마지막에 제일 큰 값이 온다)
				for(int j=0; j<numArr.length-1; j++) { //옆자리 비교(1-2,2-3,3-4 ...), numArr.length-1인 이유는 인덱스가 0부터 시작하기 때문이다
					if(numArr[j] > numArr[j+1]) { //j는 0부터니까 numArr[0]값이 numArr[0+1(옆의 값)]보다 크면 (반대로 큰 값이 먼저 올려면 j가 j+1보다 작을 때로 비교하면 된다.)
						temp = numArr[j]; //temp에 numArr[0]을 저장하고,
						numArr[j] = numArr[j+1]; //numArr[0+1]을 numArr[0]에 저장하고,
						numArr[j+1] = temp; // temp(numArr[0])를 numArr[0+1]에 저장함으로 numArr[0]과 numArr[0+1]의 값이 교환되어 큰 값이 뒤로 간다
					}
				}
			}
			
		for(int i=0; i<numArr.length; i++) { 
			System.out.print(numArr[i] + " "); //numArr[i~numArr.length numArr[] 값을 출력]
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int c;
		for(int i=0; i<numArr.length; i++) {
			for(int j=0;j<numArr.length-1;j++) {
				if(numArr[j] < numArr[j+1]) { //numArr[j]값이 옆에 있는 numArr[j+1]보다 작으면 값 교환,작은 것이 뒤로 간다
					c = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = c;
				}
			}
		}
		for(int i=0; i<numArr.length;i++) {
			System.out.print(numArr[i] + " ");
		}
		
		
	}
		
		
}
		
	
	
	



