package ch13.ex01;


class Apple1{
	
	@Override
	public String toString() {
		return "I am an apple";
	}
}

class Orange1{
	@Override
	public String toString() {
		return "I am an orange";
	}
}


class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}



public class 제네릭이해2 {

	public static void main(String[] args) {
		
		Box abox = new Box();
		Box obox = new Box();
		
		abox.setObj(new Apple());
		obox.setObj(new Orange());
		
		Apple1 ap = (Apple1)abox.getObj();
		Orange1 op = (Orange1)obox.getObj();
		System.out.println(ap);
		System.out.println(op);
		
	}

}
