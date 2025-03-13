package ch07.ex05;

public class SamsungTV extends TV{
	
	void powerOn() {
		this.power = true;
		System.out.println("SamsungTV의 전원이 꺼집니다.");
		
	}
	void powerOff() {
		this.power = false;
		System.out.println("SamsungTV의 전원이 꺼집니다.");
		
	}
	void volumeUp() {
		System.out.println("SamsungTV의 사운드를 올립니다.");
		
	}
	void volumeDown() {
		System.out.println("SamsungTV의 사운드를 내립니다.");
	}

}
