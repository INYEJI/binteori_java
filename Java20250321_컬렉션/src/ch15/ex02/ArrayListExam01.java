package ch15.ex02;

import java.util.ArrayList;

public class ArrayListExam01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); //배열 형성
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		
		list.remove(0); //0번째 인덱스 값 삭제!
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println();
		
		list.clear(); //전부 삭ㅈㅔ
	}

}
