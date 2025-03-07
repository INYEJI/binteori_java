package ch06.ex05;

public class Car {
	
	 String company = "현대자동차";
	 String model;
	 int maxSpeed;
	 String color;
	 private int speed;
			
	
	Car(){
		
	}		
	
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}

		public Car(String color, int speed, int maxSpeed) {
		this.color = color;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
	}
	
	
	
		Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
		 
		void setSpeed(int speed) {
			this.speed = speed;
		}
			
		int getSpeed() {
			return this.speed;	
			}
	
		}

