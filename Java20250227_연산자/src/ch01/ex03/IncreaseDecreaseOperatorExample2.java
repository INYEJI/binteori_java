package ch01.ex03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		//증감연산자 - 전위 , 후위 사용X
		
		int a = 1;
		int b = 0;
		a = a+1; //우항 먼저 계산 후, 좌항
		b = a;
		System.out.println("a="+a+",b="+b);
		System.out.printf("a=%d,b=%d\n", a,b);
		
		int c = 1;
		int d = 0;
		d = c;
		c = c+1;
		System.out.printf("c=%d, d=%d\n",c,d);
	}

}
