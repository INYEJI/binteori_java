package ch07.ex07;

public class ProductTest {

	public static void main(String[] args) {

		Product[] product = new Product[5];
		
		product[0] = new Product();
		product[1] = new Product("새우깡",10,1500);
		product[2] = new Product("신라면",100,1300);
		product[3] = new Product("담배",10,4500);
		product[4] = new Product("소주", 20, 1500);

		for (int i=0; i<product.length;i++) {
			System.out.println(product[i]);
		}
	}

}
