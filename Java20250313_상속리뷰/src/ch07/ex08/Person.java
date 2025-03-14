package ch07.ex08;

public class Person {
	
	private String name;
	
	Person(){}
	Person(String name){
		this.name = name;
	}
	
	public String getInfo() {
		return '"'+name+'"';
	}

}

class Friend extends Person{
	
	private String phoneNum;
	private String email;
	
	Friend(){}
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo() +'"'+ phoneNum +'"'+'"' + email+'"';
	}
}