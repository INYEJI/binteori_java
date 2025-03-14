package ch07.ex08;

public class SalaryExpr {
	
	int bonus;
	int grade;
	
	SalaryExpr(){
		bonus = 0;
	}
	
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	
	int getSalary(int grade) {
		if(grade == 1){
		return bonus+100;
		}else if(grade == 2) {
			return bonus+90;
		}else if(grade == 3) {
			return bonus+80;
		}else if(grade == 4) {
			return bonus+70;	
		} else {
		return bonus;	
		}
	
	}
}
