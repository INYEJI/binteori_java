package ch07.ex07;

public class Book {
	private String title;
	private String author;
	private int price;
	
	Book(){
		title = "자바의 정석";
		author = "남궁성";
		price = 35000;
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return title +" "+ author +" " + price;
	}
	

}
