package ch04.ex02;

public class 복습 {

	public static void main(String[] args) {
		//자료형 변수 = 값(초기값)
		int num = 0; //스택에 정수를 집어넣겠다는 이야기(허용범위 있음)
		int num2 = 0;
		int num3 = 0;
		
		num = num + 1; //num = 1
		num += 1; //num = 2
		//++num; //증감연산자(전위) num = 3		
		//num++; //증감연산자(후위) num = 4 , line10부터 13까지는 같은 말
		
		num2 = ++num; //연산 먼저 num+1 = num2 
		num3 = num++; //num = num3  그이후 num+1
		
		System.out.printf("%d %d %d\n" , num ,num2,num3);
		
		

	}

}
