package ch06.ex05;

public class CarCar {

		private String brand;
		private String model;
		private String year; //(1) 필드 선언
	
		
		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}//setter와 getter를 자동생성해준다.
		
		

		public CarCar (String b,String m,String y) {
			this.brand = b;
			this.model = m;
			this.year = y;	
		} //(2)생성자 생성
		
		void startEngine() {
			System.out.println(brand + model + "의 엔진이 시작되었습니다!");
		}
		
		void displayInfo() {
			System.out.printf("자동차 정보 : %s년식 %s %s\n", year,brand,model); //(3)매소드 구현
		}
		
}
//this(brand,model,year); 이라고도 구현할 수 있다


//1)객체 자기 자신 : 생성자와 메소드의 매개변수명 = 인스턴스 멤버 필드명 
//	즉 위에서 필드가 String brand 이고, 
//	public CarCar (String brand) { this.brand = brand;}
//2)생성자 호출 : this(model,color,"200")로 생성자 호출 하면 
//	car(String model, String color,String year);에 
//	this.year=year의 year자리에 "200"으로 들어감
//	호출하고 싶은 생성자의 매개변수에 맞게 매개값 제공





