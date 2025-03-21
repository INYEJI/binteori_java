package ch15.ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) {
		
		Set<String> list = new HashSet<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
	
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		System.out.println();
		
		
	
	}

}
