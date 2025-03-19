package ch08.ex02;

public abstract class Employee {
	
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public Employee(){}
	public Employee(String name,int number, String department, int salary){
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract double tax();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

class Secretary extends Employee implements Bonus{
	
	public Secretary(){}
	public Secretary(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}
	
	public double tax() {
		return getSalary()*0.1;
	}
	
	public void incentive(int pay) {
		int salary = getSalary();
		salary += pay*0.8;
		setSalary(salary);
	}
	
}

class Sales extends Employee implements Bonus{

	public Sales(){}
	public Sales(String name, int number, String department, int salary){
		super(name,number,department,salary);
		}
	
	public double tax() {
		return getSalary()*0.13;
	}
	
	public void incentive(int pay) {
		int salary = getSalary();
		salary += pay*1.2;
		setSalary(salary);
	}
	
	
	public double getExtraPay() {
		return getSalary()*0.03;
		}
	}

