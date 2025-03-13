package ch07.ex07;

import java.text.DecimalFormat;

public class Product {
	
	String name;
	int balance;
	int price;
	
	Product(){
		name = "듀크인형";
		balance = 5;
		price = 10000;
	}
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###");
		return name + " " + balance+" "+ formatter.format(price) + "원";
	}
	String getName(){
		return name;
	} 
	
	int getBalance() {
		return balance;
	}
	
	int getPrice() {
		return price;
	}

}
