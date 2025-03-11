package ch07.ex05;

public class MainAccount {

	public static void main(String[] args) {

		
		Account acc = Account.getInstance(); //정적메소드 호출(class.메소드) => 싱글톤 개체 획득
		
		acc.setBalance(100);
		System.out.println(acc.getBalance());
		
		Account acc2 = Account.getInstance();
		System.out.println(acc2.getBalance());
		
		
		}

}

