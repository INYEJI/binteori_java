package ch06.ex01;
/*
 * 이름, 나이, 전화번호, 국어, 영어, 수학 ->정적 (변수)
 * 안타치기, 도루하기, 홈런치기, 볼넷얻기 -> 동적 (함수)
 */


public class 클래스도입 {

	public static void main(String[] args) {
		
		String name = "터리";
		String phone = "010-1111-2222";
		int age, kor, eng, math;
		age = 2;
		kor = 20;
		eng = 10;
		math = 100;	
		
		공부하기(name);
		시험보기(kor,eng,math);
		등교하기(name);
		
		System.out.println("-------------------------");
		
		String name2 = "애벌레";
		String phone2 = "010-2729-3613";
		int age2, kor2, eng2, math2;
		age2 = 23;
		kor2 = 80;
		eng2 = 70;
		math2 = 90;	
			
		공부하기(name2);
		시험보기(kor2,eng2,math2);
		등교하기(name2);	 
		 
		
	}
	
	public static void 공부하기(String name) {
		System.out.println(name + " 공부하기");
	}
	
	public static void 시험보기(int kor, int eng, int math) {
		int sum = kor + eng + math;
		System.out.println("세 과목 합 : " + sum);
		
	}
	public static void 등교하기(String name) {
		System.out.println(name + " 등교하기");
	}
}
