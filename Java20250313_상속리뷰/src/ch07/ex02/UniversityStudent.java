package ch07.ex02;

public class UniversityStudent extends Student {

	private String major;
	
	UniversityStudent(){}
	UniversityStudent(String name, int age, String schoolName, int grade, String major){
		super(name, age, schoolName, grade);
		this.major = major;
	}
	
	void registerCourse() {}
	@Override
	void introduce() {
		System.out.println("안녕하세요. 저는" + major + "전공하고 있는" + getName() + "입니다.");
	}
}