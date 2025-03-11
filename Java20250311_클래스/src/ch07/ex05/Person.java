package ch07.ex05;
/*
 * setter,getter
 */

public class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(){
		this("남산",1);
		//name = "남산";
		//age = 1;
	}
	
	public Person(String name) {
		this(name,1);
		//this.name = name;
		//age = 1;
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	String displayInfo() {
		return name + ";" + age;
	}
	
	public void run() {
		System.out.println("Run!");
	} //다른 패키지에서 쓰고 싶으면 public을 붙여줘야함
	public void eat() {
		System.out.println("Eat!");
	}
	
}
