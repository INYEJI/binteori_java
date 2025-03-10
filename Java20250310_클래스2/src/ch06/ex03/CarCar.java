package ch06.ex03;

public class CarCar {

	int speed;
	void run() {
		speed = 100;
	}
	
	public static void main(String[] args) {
		CarCar car = new CarCar();
		car.speed = 200; //정적 메소드 내에서 인스턴스 값을 변경하고 싶을 떄 new연산자로 객체를 만들어놓고 ..!
		
	}//public class 밑에 public main이 포함되어있어야함. 
	
}
