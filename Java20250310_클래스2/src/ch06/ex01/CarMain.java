package ch06.ex01;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();	
		car1.displayInfo();//초기값이 없으면 => 출력 시 아무것도 안 나옴(의미없다)
		System.out.println();
		
		Car car2 = new Car("기아","k8", "흰색", 200); //생성자 불러옴 -> 값 대입
		car2.displayInfo(); //메소드 호출
		System.out.println();
		
		Car car3 = new Car("현대", "소나타");
		car3.setColor("흰색"); //색 값 추가(변경)
		car3.displayInfo();
		
		System.out.println("내 차는 " + car3.getColor());
		System.out.println();
		
		
	}

}
