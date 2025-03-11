package ch07.ex05;

public class Account {
	
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private static Account ac = new Account(); //private 접근 권한을 갖는 정적 필드 선언과 초기화(객체 1개만 내부에서 생성하게)
	
	private Account() { //private 접근 권한을 갖는 생성자 선언
		
	}
	
	
	static Account getInstance() { //public 접근 권한을 갖는 정적 메소드 선언
		return ac;
	}
	
	
	
	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance && balance<=MAX_BALANCE){
		this.balance = balance; }
	}
	
	
		int getBalance() {
		return balance;
	}
	
	}
		

