package ch02.ex03;

public class MainPerson {

	public static void main(String[] args) {

		Person person = new Person("터리", 2);
		
		String msg = person.introduce();
		System.out.println(msg);
		
		
	}

}
