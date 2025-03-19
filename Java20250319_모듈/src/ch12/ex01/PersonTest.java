package ch12.ex01;

import lombok.Setter;


class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() {
		System.out.println("---------hashCode----------");
		int result = name != null ? name.hashCode() : 0;
		//자바에서 객체 해시를 생성할 때 필드들의 해시를 혼합할 목적으로 주로 31 소수값을 곱해줌
		result = 31*result + age;
		return result;
	}
	
	public boolean equals(Object obj) {
		System.out.println("---------equals----------");
		Person o = (Person)obj;
		return this.age == o.age && this.name == o.name;
	}

}

public class PersonTest {
	
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");	
		System.out.println(str1.equals(str2)); //문자열이 동일한지?
		
		Person p1 = new Person("홍길동",10);
		Person p2 = new Person("박길동",20);
		System.out.println(p1.equals(p2)); //저장된 값이 같은지?
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());//hashCode가 같은지 확인.
		
		
		Person p3 = new Person("홍길동",10);
		Person p4 = new Person("홍길동",10);
		System.out.println(p3.equals(p4)); //저장된 값이 같은지?
	}
}
