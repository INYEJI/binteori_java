package ch13.ex01;


class Apple2{
	
	@Override
	public String toString() {
		return "I am an apple";
	}
}

class Orange2{
	@Override
	public String toString() {
		return "I am an orange";
	}
}


class Box1{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}



public class 제네릭이해3 {

	public static void main(String[] args) {
		
		Box1 abox = new Box1();
		Box1 obox = new Box1();
		
		abox.setObj("new Apple2()"); //메소드를 부르는 것이 아니라 문자열로 인식해서 프린트
		obox.setObj("new Orange2()");

		System.out.println(abox.getObj());
		System.out.println(obox.getObj());
		
	}

}
