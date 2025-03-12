package ch07.ex03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run(); //Car class에서 tire 변수의 값이 없기 때문
		
		myCar.tire = new Tire();//
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		

	}

}
