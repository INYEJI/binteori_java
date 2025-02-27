package ch02.sec01;

public class VariableExchangeExam {

	public static void main(String[] args) {
		
		int a = 10; //변수 선언 : 타입 + 변수명 
		int b = 20;
		System.out.println("a = " + a + ", b = " + b);
		
		int c = a; //값 교환 시에는 새로운 변수를 선언
		 a = b; //앞에서 선언한 이후에는 같은 변수명으로 재 선언 불가능, 값 변경시에는 (변수명 = 값) 이런식으로 써야함
		 b = c;
		System.out.println("a : " + a + " , b : " + b);
	}

}
//메모리 할당 크기에 저장되는 값 이상이 들어오면 컴파일 에러

//float(4) < double(8), double이 기준이기 때문에 float에 숫자를 넣을 땐 뒤에 f를 넣어야 한다
//long(8) < float(4) , 실수인 float가 정수인 long보다 더 많은 영역을 커버하기 때문에 float에 long값이 들어갈 수 있다.
//자동 타입 변환 : int가 기준이고 이 기준이 허용범위보다 크면 자동변환가능(byte,short) , *허용범위가 작은 타입이 큰 타입에 대입될 때
//int가 기준이라 long을 쓸 때는 뒤에 L을 붙힘
//char 타입* 유니코드값이 대입됨. byte 타입은 음수범위를 포함해서 자동변환 불가