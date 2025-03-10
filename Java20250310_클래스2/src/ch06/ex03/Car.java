package ch06.ex03;

public class Car { 
	
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	public static int count; //정적변수
	
	static String companyState = "GM"; //정적변수
	
	public static void runState() { //정적메소드
		//정적 메소드 안에서 사용할 수 있는 변수 및 메소드는 
		//static이 붙어있는 정적 메소드 정적변수만 사용 가능
		System.out.println("Static run()");
	}

	public Car() {
		//this(),super() => 함수 맨 앞에 와야함.
		this("현대","그랜저","검정",250);
		System.out.println(++Car.count); //정적변수사용
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
