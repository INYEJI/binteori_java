package ch06.ex02;

import java.util.Random;

public class CarMain {

	public static void main(String[] args) {
		
		
	Car.runState(); //객체를 생성하지 않고 , 클래스명.정적메소드명 / 클래스명.정적변수명으로 실행 가능
	System.out.println(Car.companyState);
		
	Car car1 = new Car();
	car1.displayInfo();
	car1.runState(); //정적class인지 인스턴스class인지 구분이 잘 안되어서 저렇게 쓰지말고,
	System.out.println();//클래스명.정적메소드명으로 => car.runState();
	  
	Car car2 = new Car("기아","k8", "흰색", 200);
	car2.displayInfo();
	System.out.println();
		 
	
	Random random = new Random();
	int num1 = (int)(random.nextInt(45)+1); //인스턴스 메소드
	
	
	int num2 = (int)Math.random()*45+1;	 //정적메소드
	
	
	System.out.println(num1 + "," + num2);
		
	}

}
