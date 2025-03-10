package ch07.ex01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myphone = new SmartPhone("갤럭시","은색");
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델 : " + myphone.model);
		System.out.println("색상 : " + myphone.color);
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 : " + myphone.wifi);
		//Phone으로부터 상속받은 메소드 호출
		myphone.bell();
		myphone.sendVoice("여보세요");
		myphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		myphone.sendVoice("아~ 네, 반갑습니다.");
		myphone.hangUp();
		
		myphone.setWifi(true);
		myphone.internet();

	}

}
