package ch15.ex02;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExam01 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>(); //List가 상위 클래스이기 때문에 Linked,Array 모두 참조가능!!!
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		list.add(0, "Robot");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		System.out.println();
		
		
		list.remove(0); //0번째 인덱스 값 삭제!
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println();
		
		list.clear(); //전부 삭ㅈㅔ
	}

}
