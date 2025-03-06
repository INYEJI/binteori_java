package ch06.ex02;
/*
 * 함수 2개 생성
 * 매개변수로 100 정수값을 전달하면
 * 함수1은 1~100 사이 홀수 값 리턴
 * 함수2는 1~100 사이 짝수 값 리턴
 * 메인 함수에서 두 값을 호출하고, 각 전달 값을 출력한다.
 */


public class FunctionExam1 {

	public static void main(String[] args) {
		int result1 = sum1(100);
		int result2 = sum2(100);
		System.out.println("result1 = " + result1 + ", result2 = " + result2);

	}
		public static int sum1(int n1) {
			for(int i=0; i<=100; i++) {
				if(i%2 == 1) {
					n1 += i;
				}
			} 
			return n1-100;
		}

		public static int sum2(int n2) {
			for(int i=0; i<=100; i++) {
				if(i%2 == 0) {
					n2 += i;
				}
			}
			return n2-100;
		}
		
}
