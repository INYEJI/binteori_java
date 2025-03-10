package ch06.ex02;

public class Car { 
	
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	static void runState() {
		System.out.println("Static run()"); //정적메소드
	}
	
	
	static String companyState = "GM"; //정적 변수
	
	
	public Car() { 
		this("현대", "그랜저", "검정", 250);
	}
	
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company; 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

	public void run() {
		System.out.println(company + " 달린다.");
	}
	
	
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}
	
}
