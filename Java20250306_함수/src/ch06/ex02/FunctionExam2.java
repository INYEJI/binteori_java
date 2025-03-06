package ch06.ex02;
/*
 * 함수 2개 생성
 * 매개변수로 100 정수값을 전달하면
 * 함수1은 1~100 사이 홀수 값 리턴
 * 함수2는 1~100 사이 짝수 값 리턴
 * 메인 함수에서 두 값을 호출하고, 각 전달 값을 출력한다.
 */


public class FunctionExam2 {

	public static void main(String[] args) {
		int[] number = new int[10];	
		
		for(int i=0; i<10; i++) {
			number[i] = (i+1)*10;
		} //함수호출전까지는 그대로 실행 number[i]에 10,20,30,40,50,60,70,80,90,100 까지 있음  	
		
		int result1 = odd(number); //각 number자리에 return sum값이 들어감
		int result2 = even(number); //함수호출했어서 각각 함수로
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}		
		

	
	
		public static int odd(int[] numA) { //1.odd (매개변수 선언)  = numA [새로운 갯수]
			int sum = 0;
			for(int j=0; j<numA.length; j++) { 
				if((numA[j]/10)%2 == 1) {
					sum += numA[j];
				}
			}  return sum;
		}

		public static int even(int[] numB) { //2. even(number)  = numB[새로운 갯수]
			int sum = 0;
			for(int j=0; j<numB.length; j++) {
				if((numB[j]/10)%2 == 0) {
					sum += numB[j];
				}
			}
			return sum;
		}
		
}
