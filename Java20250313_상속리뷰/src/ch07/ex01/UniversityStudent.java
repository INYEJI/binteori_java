package ch07.ex01;

public class UniversityStudent extends Student {

	private String major;
	private boolean isIntens;
	private int sholarship;
	
	void registerCourse() {}
	void introduce() {
		System.out.println("안녕하세요. 저는" + major + "전공하고 있는" + getName() + "입니다.");
	}
}