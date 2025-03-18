package ch08.ex01;

public class RemoteTest {

	public static void main(String[] args) {

		RemoteControl remote = new Radio(); //인터페이스명(or상위,추상 클래스명) 변수 = new 하위클래스 ; 상위클래스는 하위클래스 참조가 가능하기때문
		
		remote.turnOn(); //Radio 클래스에 있는 turnOn 메소드 호출, 실행
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.min_volume);

	}

}

class A{
	public static int number=100;
}

class B{
	public static int number=100;
}