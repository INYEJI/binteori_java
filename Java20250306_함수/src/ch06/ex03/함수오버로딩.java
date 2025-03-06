package ch06.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
		
		functionA(10,2);
		
	}
	
	public static void functionA() {
		System.out.println("functionA");
	}
	public static void functionA(int n) {
		System.out.println("void function(int n)");
	}
	public static void functionA(double n) {
		System.out.println("void functionA(double n)");
	}
	public static void functionA(int n1, int n2) {
		System.out.println("void functionA(int n1, int n2)"); //함수 이름은 똑같은데 매개변수가 다른것(여러개) => 오버로딩
	}
	
}
