package ch06.ex02;

public class Personmain {

	public static void main(String[] args) {
		
		Person cat = new Person(); //만들어둔 person class 이용해서  힙에 객체 생성
		
		cat.name = "터리";
		cat.age = 2;
		cat.phone = "010-1111-2222";
		
		cat.나이출력(cat.age);
		cat.전화번호출력(cat.phone);
		cat.이름출력(cat.name);
		
	}

}
