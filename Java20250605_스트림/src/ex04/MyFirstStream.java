package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MyFirstStream {

	public static void main(String[] args) {
		
		List<ToyPriceInfo> list = new ArrayList<ToyPriceInfo>();
		
		list.add(new ToyPriceInfo("GUN", 2000));
		list.add(new ToyPriceInfo("CAR", 5000));
		list.add(new ToyPriceInfo("TEDDy", 3000));
		list.add(new ToyPriceInfo("SHIP", 7000));
		
		//가격만 출력
		list.stream()
			.mapToInt(i->i.getPrice())
			.sorted()
			.forEach(n-> System.out.println(n));
			
		
		System.out.println();
		
		//가격 합 출력
		int sum = list.stream()
				.mapToInt(price->price.getPrice())
				.sum();
		System.out.println("총합 : " + sum);
		
		
		//가격 5000이상만 출력
		int total = list.stream()
					.filter(price-> price.getPrice()>=5000)
					.mapToInt(price->price.getPrice())
					.sum();
		System.out.println("5000원 이상 가격 합: " + total);
		
		//가격 5000원 이상 상품명 출력
		System.out.print("5000원 이상 상품 명: ");
		list.stream()
			.filter(price-> price.getPrice()>=5000)
			.forEach(p-> System.out.print(p.getModel() + " "));
			
	}

}