package ch13.ex05;

class Box<T extends Number> {
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj(){
		return obj;
	}
}


public class MutiTypeParam {

	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box<>();
		iBox.setObj(10);
		
		Box<Double> dBox = new Box<>();
		dBox.setObj(10.2);
		
		//Box<String> sBox = new Box<>(); string type은 안돼
		


	}

}
