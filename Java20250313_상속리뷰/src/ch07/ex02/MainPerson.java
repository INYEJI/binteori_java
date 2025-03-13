package ch07.ex02;

public class MainPerson {

	public static void main(String[] args) {

		UniversityStudent us = new UniversityStudent("빈터리",2,"냐옹대",3,"츄르먹기");
		
		us.introduce();
		
		Person p1 = new Person("바보털",2);
		p1.introduce();
		
		Student s1 = new Student("애벌레",23,"중앙대",4);
		s1.introduce();

	}

}
