package ch01.ex02;

public class SwitchExam {

	public static void main(String[] args) {      
	      /*
	       * 학점(grade)
	       * 90 : A
	       * 80 : B
	       * 70 : C
	       * 60 : D
	       * 59이하 : F
	       */
	      
	      int grade = 96;
	      
	     switch(grade/10) { //앞자리구간으로 점수를 주기 위해서 10을 나눔. 
	     case 10:
	     	System.out.println("A");
	     	break; //break가 없을 경우 조건을 만족할 시 밑에 있는 것을 케이스 값과 상관없이 전부 실행 무조건 break가 있어야 빠져나감
	     case 9 :
	    	 System.out.println("A"); //90점대 (즉 몫이 9인 경우) A학점
	    	 break;
	     case 8 :
	    	 System.out.println("B");
	    	 break;
	     case 7 :
	    	 System.out.println("C");
	    	 break;
	     case 6 :
	    	 System.out.println("D");
	    	 break;
	    default:
	    	System.out.println("F");
	     }
	      System.out.println("종료");
	}
}
