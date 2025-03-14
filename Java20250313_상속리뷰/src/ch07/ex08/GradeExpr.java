package ch07.ex08;

public class GradeExpr {
	
	int[] jumsu;
	
	GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	
	double getAverage(){
		double avg;
		int sum = 0;
		for(int i =0; i<jumsu.length ; i++) {
			sum += jumsu[i]; 
		}
		avg = sum/jumsu.length;
		return avg;
	}
	
	int getTotal() {
		int sum = 0;
	for(int i =0; i<jumsu.length ; i++) {
		sum += jumsu[i]; 
	} return sum;	
 }
	
	int getGoodScore() {
		int best = jumsu[0]; //0번째 값을 임의로 정해줘 꼭
		for(int i=0; i<jumsu.length ;i++) {
		if(jumsu[i]>jumsu[0]) {
			best = jumsu[i];
		} 
	} return best;
}
	
	int getBadScore() {
		int bad = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i] < jumsu[0]) {
				bad = jumsu[i];
			}
		}return bad;
	} 

}
