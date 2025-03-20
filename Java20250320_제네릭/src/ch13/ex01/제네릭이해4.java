package ch13.ex01;


class Apple3{
	
	@Override
	public String toString() {
		return "I am an apple";
	}
}

class Orange3{
	@Override
	public String toString() {
		return "I am an orange";
	}
}


class Box2<T>{ //타입의 안전성을 보장(많은 타입들 커버 가능),제한가능
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}



public class 제네릭이해4 {

	public static void main(String[] args) {
		
		Box2<Apple3> aBox = new Box2<Apple3>();
		Box2<Orange3> oBox = new Box2<Orange3>();
		
		aBox.setObj(new Apple3());
		oBox.setObj(new Orange3());
		
		Apple3 ap = aBox.getObj();
		Orange3 op = oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);

		
	}

}
