package ch01.ex09;

public class EqualExample {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		String str1 = "korea";
		String str2 = "korea";
		System.out.println(n1==n2);
		System.out.println(str1==str2);
		
		String str3 = new String("korea");
		String str4 = new String("korea");
		System.out.println(str3 == str4); //결과가 false인 경우, new라는 것이 강제로 새로운 공간을 만들어서 값을 저장함
		//문자열 비교시 비교대상.equals(변수) 와 ! 비교대상.equals(변수) 사용  ex) str3.equals(str4)

		//ex) 0.1f (float) == 0.1 (double) 은 같지 않음, 둘의 정밀도 차이 때문, 강제 타입 변환 후 비교연산 
	
		System.out.println( (5>2) ^ (3>1) ); //false
		System.out.println( (5>2) ^ (3<1) ); //true
		System.out.println( (5<2) ^ (3>1) ); //true
		System.out.println( (5<2) ^ (3<1) ); //false
		
		
		//and && (둘 다 만족) , or | (둘 중에 하나만 해도) , xor ^(하나는 참,하나는 거짓), NOT !(논리값을 바꿈)
		
	}

}
