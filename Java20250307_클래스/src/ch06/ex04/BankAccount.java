package ch06.ex04;

public class BankAccount {

	private String owner;
	private double balance;
	
	public BankAccount() { }
	
	public BankAccount(String owner, double balance) { //this를 붙이면 위에껄 쓰겟다는 뜻.
		this.owner = owner;
		this.balance = balance;
	}
	
	double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
		System.out.println("잔액부족");
		} else {
			balance -= amount;
		}
	}
	

	
}


