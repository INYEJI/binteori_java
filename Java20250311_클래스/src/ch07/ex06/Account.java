package ch07.ex06;

public class Account {
	
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	
	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance && balance<=MAX_BALANCE){
		this.balance = balance; }
	}
	
	
	public int getBalance() {
		return balance;
	}
	
	
	public Account() {}
	public Account(int balance) {
		this.balance = balance;
	}
	
	

}
