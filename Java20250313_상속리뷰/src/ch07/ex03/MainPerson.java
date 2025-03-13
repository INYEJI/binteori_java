package ch07.ex03;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person(); //p1 = person참조
		Student s1 = new Student(); //s1 = student참조
		UniversityStudent u1 = new UniversityStudent(); //u1 = US참조
		
		method(u1); //u1이 메소드라는 메소드 호출
		method(s1);//s1
		method(p1);//p1
	}
	
	static void method(Person p) { //하위클래스도 참조할 수 있도록 상위클래스사용
		
		if(p instanceof UniversityStudent) { //만약 Person p가 US를 참조하면, 3가지 메소드 호출
			UniversityStudent u = (UniversityStudent)p;
			u.sleep();
			u.study();
			u.registerCourse();
		} else if(p instanceof Student) { //만약 p가 St를 참조하면, 2가지 메소드 호출
			Student s = (Student)p;
			s.sleep();
			s.study();
		} else { //만약 p가 P를 참조하면 1가지 메소드 호출
			p.sleep();
		}
		System.out.println("--------------------------------");
	} 

}
