package ch07.ex08;

public class Human {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human(){}
	public Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String printInformation(){
		return name + "," + age + "," + height + "," + weight+",";
	}

}

class Student extends Human{
	private String number;
	private String major;
	
	public Student(){}
	public Student(String name, int age, int height, int weight, String number, String major){
		super(name,age,height,weight);
		this.number = number;
		this.major = major;
	}
	
	
	public String printInformation(){
		return  super.printInformation() + number + "," + major; //super로 상위 클래스의 메소드 호출!!!!
		
	
	}
}
