package ch13.ex04;

class Box<T extends A> {
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj(){
		return obj;
	}
}

class A{}
class B extends A{}
class C extends B{}

class D{}
class Person{}
class Car{}

public class MutiTypeParam {

	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		


	}

}
