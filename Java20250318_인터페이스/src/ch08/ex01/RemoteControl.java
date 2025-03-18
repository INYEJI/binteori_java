package ch08.ex01;

public interface RemoteControl {
	//일반 메소드 X
	
	
	public static final int MAX_VOLUME = 10;
	int min_volume = 0;
	/*
	 * interface 상수
	 * 멤버 변수 생성 불가
	 * 정적 변수만 생성 가능
	 */
	
	//추상메소드
	public void turnOn();
	
	//추가된 메소드
	void turnOff();
	void setVolume(int voulume); 
	
	//=>구현 클래스에선 인터페이스에서 선언된 모든 추상메소드를 재정의해서 코드를 가져와야함
	
	//디폴드 메소드
	default void 신기능() {
		
	}
}
