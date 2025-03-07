package ch06.ex03;

public class Person { //person이라는 class를 생성한 코드 (변수(정적인 것) + 함수(동적인것) 이용)
	
	private String name; //필드선언(객체 데이터 저장)
	private String phone;	
	private int age;
	//외부에 노출되는 것을 막기 위해(밖에선 접근 할 수 없게,변수를 통해 값이 달라질 수 있게 때문) private(접근제한자) 를 붙여준다.class내부에서만 사용가능
	
	//ClassName() { } ;생성자 = new 연산자 객체 초기화 담당, 이름은 클래스 이름과 동일, 이름은 같고 매개변수가 다르게 여러 개 만들 수 있음(오버로딩)
	
		public Person() { //public은 외부에 공개되어있음
			
		} //디폴드 생성자
		
		public Person(String n, int a, String p) {
			name = n;
			age = a;
			phone = p;
			
		}
	
		//메소드 : 객체가 수행할 동작, 객체간의 상호작용
		void 나이출력() {
		System.out.println("나이는 : " + age);
	}
	
		void 전화번호출력() {
		System.out.println("전화번호 : " + phone);
		
	}
		void 이름출력() {
		System.out.println("이름은 : " + name);
	}

}
