package ch01.ex02;

public class ifExam {

	public static void main(String[] args) {
	
		int score = 55;
		
		if(score>=90) { //만약 점수가 90점 이상이면
			System.out.println("A"); //A 출력 (바로 빠져나감)
		}
		else if(score>=80) { //(1) 90점 이상이 아니고, 80점 이상이면 
			System.out.println("B"); //B 출력
		}
		else if(score>=70) { //(2)90,80점 이상이 아니고, 70점 이상이면
			System.out.println("C");//C 출력
		}
		else if(score>=60) { //(3)90,80,70점 이상이 아니고, 60점 이상이면
			System.out.println("D"); //D 출력
		}
		else {//(4)다 아니면
			System.out.println("F");//F 출력
		}
	}

}
