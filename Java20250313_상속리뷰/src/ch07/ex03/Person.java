package ch07.ex03;

public class Person {
	private String name;
	private int age;

	
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	void sleep() {
		System.out.println("sleep()");
	}
	void eat() {
		System.out.println("eat()");
	}
	
	
	
	@Override
	public String toString() { //오버라이딩으로 재정의 object => 하위클래스까지
		return "Person [name=" + name + ", age=" + age + "]";
	}
	void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "이고, 나이는" + age + "살입니다.");
	}

}
