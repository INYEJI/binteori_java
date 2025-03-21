package ch15.ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Member [name=" + name + ", age =" + age+ "]";
	}
	
	public int hashCode() {
		System.out.println("---------hashCode---------");
		return name.hashCode()+age;
	}
	
	public boolean equals(Object obj) {
		System.out.println("----------equals-----------");
		if(obj instanceof Member Target) {
			return this.name.equals(name) && (this.age == age);
		} else {
			return super.equals(obj);
		}
	}
	
}
		
public class SetExam{
		
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("고길동",45));
		set.add(new Member("홍길동",20));
		
		for(Member m : set) {
			System.out.println(m);
		}
	}
}
		
	
