package ch06.ex03;

public class Personmain {

	public static void main(String[] args) {
		
		Person cat = new Person("똥터리",2,"전화번호 없음!"); //만들어둔 person class 이용해서  힙에 객체 생성 => class에서 생성자를 만들고, 없으면 디폴트 생성자(매개변수가 없는 것) 자동 생성
		
		
		cat.나이출력();
		cat.전화번호출력();
		cat.이름출력();
		
		//person.age = 30; 내부에 있는 것을 건들 수 없다
		
		Person p2 = new Person("애벌레",23,"010-2729-3613");
		

		p2.나이출력();
		p2.전화번호출력();
		p2.이름출력();
	}

}
