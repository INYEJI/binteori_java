package ch13.ex07;

class Box<T>  {
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj(){
		return obj;
	}
	@Override
	public String toString() {
		return (String)obj;
	}
	
}

class A{}
class B{}
class C extends B{}
class D{} 




class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
		
	}
	
	public static void peekBox(Box<? extends B > box) { //상한제한 : 읽기전용, 쓰기 금지
		System.out.println(box);
	}

	public static void peekBox2(Box<? super C > box) { //하한제한 : 쓰기전용, 읽기금지
		System.out.println(box);
	}
}



public class WildcardExam01 {

	public static void main(String[] args) {
		Box<B> box = new Box<>();
		box.setObj(new B());
		
		Unboxer.peekBox(box);
	}

}
