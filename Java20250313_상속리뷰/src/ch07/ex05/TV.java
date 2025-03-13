package ch07.ex05;

public abstract class TV { //추상메소드가 1개 이상 있으면 추상 class

	
	boolean power;
	int volume;
	
	TV(){
		power = false;
		volume = 0;
	}
	
	abstract void powerOn();  //추상메소드 { } 실행내용인 중괄호가 없음
		
	
	
	abstract void powerOff(); 
		
	
	abstract void volumeUp() ;
		
	
	abstract void volumeDown(); //자식 클래스가 상속 받을 때 메소드 오버라이딩을 해야한다.
		
	//일반 메소드도 있을 수 있음
	
	
	
	

}
