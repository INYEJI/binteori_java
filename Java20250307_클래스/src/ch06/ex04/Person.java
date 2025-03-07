package ch06.ex04;

public class Person { //Person이란 class를 만듦
	
	/*
	 * 멤버 변수 -> 값 세팅법
	 * 1. 생성자
	 * 2. setter
	 */

	//생성자를 하나도 안만들었을 때 => 알아서 디폴트값해줌 ()빈칸으로
	//생성자를 만들었으면, 디폴트 생성자를 자동으로 만들어주지 않음
	
	
		private String name;
		private int age;
		private String phone; //멤버 변수들 선언(외부에서 접근X) 
		
		
		public Person() { //생성자1(디폴트)
			System.out.println("Person()");
		}
		
		public Person(String n) {//생성자2(이름만)
			System.out.println("Person(String n)");
			name = n;
		}
		
		public Person(String n, int a, String p) {//생성자3(이름,나이,폰번호)
			System.out.println("String n, int a, String p");
			name = n;
			age = a;
			phone = p;
		}
		
		
		void setName(String n) { //setName = setter 값을 바꿔줌 
			name = n;
		}
		
		void setAge(int a) {
			age = a;
		}
		
		String getName() { //getter 값을 불러온다,return 필수
			return name;
		}
		
		int getAge() {
			return age;
		}
	
		private void run() { //동작들 (메소드)
			System.out.println(name + "달리다!");
		}
		
		void sleep() {
			System.out.println(name + "자다!");
		}
		
		void eat() {
			System.out.println(name + "먹다!");
		}
}	
