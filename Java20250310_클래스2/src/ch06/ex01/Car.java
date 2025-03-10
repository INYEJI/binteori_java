package ch06.ex01;

public class Car { //클래스 선언
	
	
	
	private String company; //매개변수 초기화
	private String model;
	private String color;
	private int maxSpeed;
	
	
	
	
	public Car() { //생성자 생성
		/*this.company = "현대";
		 * 
		this.model = "그랜저";
		this.color = "검정색";
		this.maxSpeed = 250;*/
		this("현대", "그랜저", "검정", 250);
	}
	
	public Car(String company) {
		this.company = company;
	}
	
	public Car(String company, String model) {
		/*this.company = company;
		this.model = model;
		this.color = "검정색";
		this.maxSpeed = 250;*/
		this(company, model, "검정색", 250); //(1)this()의 활용 = 다른 생성자 호출
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company; //(2)this.의 활용 = 앞의 매개변수 지칭
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	void setColor(String color) { //main에서 변수를 바꿀 수 있도록 setter 설정
		this.color = color;
	}
	
	void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	String getColor(){ //getter 리턴값이 있기 때문에 앞에 반드시 타입이 있어야함
		return color;
	}
	
	int getMaxSpeed() { //Source -> generate setter & getter 에서 자동생성
		return maxSpeed;
	}
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
	

	public void run() { //메소드 생성
		System.out.println(company + " 달린다.");
	}
	
	
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}
	
}
