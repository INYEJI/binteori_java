package ch13.ex03;

class Box<T> {
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj(){
		return obj;
	}
}


class Person{}
class Car{}

public class MutiTypeParam {

	public static void main(String[] args) {
		
		Box<String> sBox = new Box<>();
		Box<Integer> iBox = new Box<>();
		Box<Person> pBox = new Box<>();
		Box<Car> cBox = new Box<>();
		


	}

}
