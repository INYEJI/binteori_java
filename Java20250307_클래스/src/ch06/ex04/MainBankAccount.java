package ch06.ex04;

public class MainBankAccount {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount("빈터리", 10000);
		
		ba.deposit(1000);
		ba.withdraw(5000);
		
		
		System.out.println(ba.getBalance());
		

	}

}
