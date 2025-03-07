package ch06.ex04;

public class Mainperson {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("애벌레");
		
		//p1.name = "애벌레"; 멤버변수는 private이기 때문에 외부에서 내부 접근 불가
		
		//p1.run(); 외부에서 접근 불가
		p1.eat();
		
		Person p2 = new Person("빈터리", 20, "010-2729-3613");
		
		p2.eat();
		p2.setName("터리");
		p2.setAge(100);
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.println(name);
		System.out.println(age);
		
	}

}
