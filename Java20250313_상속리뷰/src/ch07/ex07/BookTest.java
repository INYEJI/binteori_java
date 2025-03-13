package ch07.ex07;

public class BookTest {

	public static void main(String[] args) {
	
		Book[] books = new Book[5];
		
		books[0] = new Book();
		books[1] = new Book("이것이 자바다","신용권",38000);
		books[2] = new Book("열혈JAVA","윤성우",35000);
		books[3] = new Book("HTML","깍두기",18000);
		books[4] = new Book("Js","js",24000);
		
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].getBookInfo());
		}
		
	}

}
