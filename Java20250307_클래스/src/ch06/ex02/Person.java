package ch06.ex02;

public class Person { //person이라는 class를 생성한 코드 (변수(정적인 것) + 함수(동적인것) 이용)
	
	String name; //필드선언(객체 데이터 저장)
	String phone;	
	int age;

	//ClassName() { } ;생성자 = new 연산자 객체 초기화 담당, 이름은 클래스 이름과 동일
	
		//메소드 : 객체가 수행할 동작, 객체간의 상호작용
		void 나이출력(int age) {
		System.out.println("나이는 : " + age);
	}
	
		void 전화번호출력(String phone) {
		System.out.println("전화번호 : " + phone);
		
	}
		void 이름출력(String name) {
		System.out.println("이름은 : " + name);
	}

}
