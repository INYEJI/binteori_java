package ch07.ex08;

public class Multiplication {
	private int dan;
	private int number;
	
	Multiplication() {}
	
	Multiplication(int dan) {
		this.dan = dan; 
}
	
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	
	void printPart() {
		if (number == 0) {
			System.out.println(dan + "단 : ");
			for(int n=1; n <= 9; n++)
				System.out.print("\t"+dan + "*" + n+ "="+dan*n);
				System.out.println();
			} else {
				System.out.print(dan+ "*"+ number +"=" + dan*number);
	}
 }
}


class GuGuDanExpr extends Multiplication{
	
	
	GuGuDanExpr(){}
	GuGuDanExpr(int dan){
		super(dan);
	}
	
	
	GuGuDanExpr(int dan, int number){
		super(dan,number);
		if((dan>1 && dan<9)&&(number>10)) {
			dan = 0;
		}
	}
	
	
	public static void printAll() {
			for(int i=1; i<=9; i++) {
				System.out.println( );
				for(int n=1; n <= 9; n++) {
					System.out.print(i + " * " + n+ " =" +i*n +" ");
				}
			} 
		}
	
	
	
	}
	
