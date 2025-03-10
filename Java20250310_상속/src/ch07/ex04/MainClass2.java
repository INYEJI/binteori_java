package ch07.ex04;

class Grandparent{
	String 할아버지성함;
	
	Grandparent(){}
	
	Grandparent(String 할아버지성함){
		this.할아버지성함 = 할아버지성함;
	}
	void FamilyInfo() {
		System.out.println("할아버지 성함은 " + 할아버지성함);
	}
}


class Parent extends Grandparent{
	int 아버지연세; 
	
	Parent(){}
	Parent(String 할아버지성함, int 아버지연세){
		super(할아버지성함);
		this.아버지연세 = 아버지연세;
	}
	void FamilyInfo() {
		super.FamilyInfo();
		System.out.println("아버지 연세는 " + 아버지연세);
	}
	
}

class Child extends Parent{
	String 나의취미;
	
	Child(){}
	public Child(String 할아버지성함, int 아버지연세, String 나의취미) {
		super(할아버지성함,아버지연세);
		this.나의취미 = 나의취미;
	}
	
	void FamilyInfo() {
		super.FamilyInfo(); //오버라이딩
		System.out.println("나의 취미는 " + 나의취미);
	}
	

	}
	


public class MainClass2 {

	public static void main(String[] args) {
		
		Child child = new Child("빈터리",2,"안타");
		child.FamilyInfo();
	}

}
