package ch07.ex08;

public class GuGuDanApp {

	public static void main(String[] args) {
		
		int dan = (int)(Math.random()*20+1); //1과 20사이 난수 발생
		int number = (int)(Math.random()*20+1);
		
		System.out.println(dan);
		System.out.println(number);

		if((dan>=1 && dan<=9) && (number>=1 && number<=9)) { 
			GuGuDanExpr gugudan = new GuGuDanExpr(dan, number);
			gugudan.printPart();
		}else if((dan>=1 && dan<=9) && (10<=number)) {
			GuGuDanExpr gugudan = new GuGuDanExpr(dan);
			gugudan.printPart();
		}else if(dan>=10) {
			GuGuDanExpr gugudan = new GuGuDanExpr();
			gugudan.printAll();
		}
	}

}
