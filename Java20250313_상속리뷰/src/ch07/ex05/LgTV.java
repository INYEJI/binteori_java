package ch07.ex05;

public class LgTV extends TV{
	

	void powerOn() {
		this.power = true;
		System.out.println("LGTV의 전원이 꺼집니다.");
		
	}
	void powerOff() {
		this.power = false;
		System.out.println("LGTV의 전원이 꺼집니다.");
		
	}
	void volumeUp() {
		System.out.println("LGTV의 사운드를 올립니다.");
		
	}
	void volumeDown() {
		System.out.println("LGTV의 사운드를 내립니다.");
	}
	
	
	
}
	
