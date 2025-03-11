package ch07.ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("설악산",50);
		Person p2 = new Person("지리산",30);
		
		String result = p1.displayInfo(); //return 값이 있기때문에 변수 생성
		System.out.println(result);
		
		System.out.println(p2.displayInfo());
		
		Person p3 = new Person();
		System.out.println(p3.displayInfo());
		
		Person p4 = new Person("치악산");
		System.out.println(p4.displayInfo());
	}

}
