package ch02.ex03;

public class Person {
	
	/*
	 * public static void main(String[] args) { 
	 * Person p = new Person("터리",2);
	 * 
	 * String msg = p.introduce(); 
	 * System.out.println(msg);
	 * 
	 * }
	 */
	
	private String name;
	private int age;
	
	public Person(String n, int a) {
		name = n;
		age = a;	
	}
	
	String introduce () {
		return "안녕하세요 제 이름은 "+ name + " 이고, "+ age + "살 입니다.";
	}

}
