package ch15.ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {

	public static void main(String[] args) {
		 	int dataSize = 100000;
	        int middleIndex = dataSize / 2;

	        // 리스트 생성 및 데이터 초기화
	        List<Integer> arrayList = new ArrayList<>();
	        List<Integer> linkedList = new LinkedList<>();
	        
	        for (int i = 0; i < dataSize; i++) {
	            arrayList.add(i);
	            linkedList.add(i);
	        }

	        // 검색 성능 테스트
	        System.out.println("==== 검색 성능 비교 ====");
	        long start = System.nanoTime(); //처음시작하는 시간과 끝나는 시간을 이용해 걸린 시간 계산(ArrayList)
	        arrayList.get(middleIndex);
	        long end = System.nanoTime();
	        System.out.println("ArrayList 검색: " + (end - start) + " ns");

	        start = System.nanoTime(); //처음시작하는 시간과 끝나는 시간을 이용해 걸린 시간 계산(LinkedList)
	        linkedList.get(middleIndex);
	        end = System.nanoTime();
	        System.out.println("LinkedList 검색: " + (end - start) + " ns");

	        // 수정 성능 테스트
	        System.out.println("\n==== 수정 성능 비교 ====");
	        start = System.nanoTime();
	        arrayList.set(middleIndex, 9999);
	        end = System.nanoTime();
	        System.out.println("ArrayList 수정: " + (end - start) + " ns");

	        start = System.nanoTime();
	        linkedList.set(middleIndex, 9999);
	        end = System.nanoTime();
	        System.out.println("LinkedList 수정: " + (end - start) + " ns");

	        // 삭제 성능 테스트
	        System.out.println("\n==== 삭제 성능 비교 ====");
	        start = System.nanoTime();
	        arrayList.remove(middleIndex);
	        end = System.nanoTime();
	        System.out.println("ArrayList 삭제: " + (end - start) + " ns");

	        start = System.nanoTime();
	        linkedList.remove(middleIndex);
	        end = System.nanoTime();
	        System.out.println("LinkedList 삭제: " + (end - start) + " ns");

		

	}

}
