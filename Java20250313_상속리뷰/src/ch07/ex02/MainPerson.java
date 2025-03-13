package ch07.ex02;

public class MainPerson {

	public static void main(String[] args) {

		UniversityStudent us = new UniversityStudent("빈터리",2,"냐옹대",3,"츄르먹기");
		
		us.introduce();
		
		Person p1 = new Person("바보털",2);
		p1.introduce();
		
		Student s1 = new Student("애벌레",23,"중앙대",4);
		s1.introduce();
		
		System.out.println("-------------------------------------");
		
		System.out.println(p1); //@이후 주석값
		System.out.println(p1.toString());
		System.out.println(s1);
		System.out.println(s1.toString());		
		System.out.println(us);

		System.out.println("---------상위클래스는 하위클래스 참조 가능----------------");
		Person p2 = new Student();
		Student s2 = new UniversityStudent();
		
		System.out.println("---------하위클래스는 상위클래스 참조 불가----------------");
		//Student s3 = new Person(); 참조 불가. 하위클래스가 더 많은 공간을 갖고 있음. 기능제한
		
		System.out.println("---------하위클래스는 상위클래스 참조 가능한 경우----------------");
		Person p4 = new Student(); // 하위클래스가 상위클래스가 갖고 있는 영역을 갖고 있기 때문
		Student s4 = (Student)p4; 
		
		p4 = new Person();
		//s4 = (Student)p4; //p4는 이제 새로운 힙 영역에 person의 객체를 생성했는데, student객체는 없기 때문에 기능제한!
		
		p4 = new UniversityStudent();
		s4 = (Student)p4; //p4는 이제 새로운 힙 영역에 universitystudent의 객체를 생성했는데, 이 안에는 student도 있기 때문에 가능
		
		System.out.println("---------다형성 : 자동 타입 변환 + 오버라이딩----------------");
		
		Person p5 = new Person(); 
		p5.sleep();
		p5.introduce();
		
		p5 = new Student(); //하위클래스 참조 가능하나
		p5.sleep(); //접근 할 수는 없엄
		p5.introduce(); //오버라이딩 했기 때문에 Student에 있는 메소드로
		
		p5 = new UniversityStudent();
		p5.eat();
		p5.introduce();
	}

}
