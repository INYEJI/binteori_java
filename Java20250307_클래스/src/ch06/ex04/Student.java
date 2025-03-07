package ch06.ex04;

public class Student {
	
	private String name; //이름
	private int grade; //학년
	private int age; //나이  =>멤버변수(필드선언) 생성 및 접근 제한(private)
	
	public Student() {
		//System.out.println("기본생성자");
	}
	
	public Student(String n, int g, int a) {
		name = n;
		grade = g;
		age = a;
		//System.out.println("이름,학년,나이 생성자"); (1)
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("나이 : " + age);
	} //메소드 (2)
	
	void setName(String n) { //setter로 값 변경 가능 (3)
		name = n;
	}
	
	void setGrade(int g) { //(5)
		grade = g;
	}
	
	String getName() { //getter로 값 변경된 것 받음 return (4)
		return name;
	}
	
	int getGrade() { //(6)
		return age;
	}

}