package ch13.ex06;

class Box<T>  {
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj(){
		return obj;
	}
}

class BoxFactory{
	/*
	 * <T> : 제네릭 메소드 표시, Box<T> : 반환타입, T o:매개변수
	 */
	public static <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.setObj(o);
		return box;
	}
}

public class MutiTypeParam {

	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.getObj());
		
		Box<Double> dBox = BoxFactory.makeBox(7.58);
		System.out.println(dBox.getObj());
		
		


	}

}
