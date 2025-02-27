package ch01.ex03;
//여러 개의 연산자가 포함되어 있는 연산식
public class IncreaseDecreaseOperatorExample3 {

	public static void main(String[] args) {
		//증감연산자 - 전위 , 후위 사용O
		
		int a = 1;
		int b = 0;
	
		b = ++a; //우항 먼저 대입, 좌항 *(즉 a값은 1증가하고, a가 1증가한 것이 b값) 변수먼저
		System.out.println("a="+a+",b="+b);
		System.out.printf("a=%d,b=%d\n", a,b);
		
		int c = 1;
		int d = 0;
	
		d = c++; //좌항 먼저 계산, 그다음 우항 *(즉 좌항은 그대로 d = c 가 되고, c는 +1증가) 연산먼저
		System.out.printf("c=%d, d=%d\n",c,d);
		
		//3개 이상 연산 할 때도 뒤에 ++이 있는 변수는 나중에 따로 처리하고 연산 먼저 한다
	
	}

}
