package ch07.ex01;






class A {
	String name;
	int age;
	
	A(){}
	A(String name, int age){ //A가 name과 age를 갖고 있어서 인자값 4개 모두 값을 받을 수 있음
		this.name = name;
		this.age = age;
	}
	void run() {
		System.out.println("run()");
	}
	void eat() {
		System.out.println("eat()");
	}
	
}

class B extends A { //B클래스가 A(상위)클래스를 상속하겠다 (정보를 쓸 수 있음)
	String id;
	
	B(){}
	B(String name, int age, String id) {
		super(name,age);//super를 통해 나머지 값을 찾으려고 함
		this.id = id;//B는 id를 갖고 있음
	}
}

final class C extends B { //순서대로 A,B,C의 정보를 다 쓸 수 있음,
	String pw; //final을 붙여서 최종 하위 클래스로 만듦
	
	C(){}
	C(String name, int age, String id, String pw){//마지막 하위 클래스가 인자값을 4개를 필요로 하기때문에 A,B,C 안에서 인자값 4개가 있어야함
		super(name,age,id); //super를 통해 위에서도 값을 찾을 수 있게 함(나머지 기입)
		this.pw = pw; //c는 pw를 갖고 있음(인자값1개)
	}
	
	void displayInfo() {
		System.out.println("A class : " + name);
		System.out.println("A class : " + age);
		System.out.println("B class : " + id);
		System.out.println("C class : " + pw);
	}
}

//class D extends C { //class C 상속불가 / C 밑으로 하위(서브)클래스 만들 수 없음
	
//}


public class Main { //반대로는 안됨 A가 B,C의 정보를 쓰는 것X
	
	public static void main(String[] args) {
		
		C c = new C("터리",2,"babo","ppww"); 
		c.displayInfo();
		
		
		
		
	}

}
