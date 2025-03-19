package ch08.ex02;

public class Company {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[5];
		employees[0] = new Secretary("Duke",1,"secretary",800); //class가 2개이기때문에 각각 클래스에서 객체 생성
		employees[1] = new Sales("Tuxi",2,"sales",1200);
		
		
		
		System.out.println("name\t\tdepartment\t\salary\t\textra pay");
		System.out.println("------------------------------------------------------------------------------------");
		Company.printEmployee(employees, false); 
		
		for(Employee emp: employees) {
			if(emp instanceof Bonus) {
				Bonus bonus = (Bonus)emp;
				bonus.incentive(100);
			}
		}
	
		System.out.println();
		System.out.println();
		System.out.println("name\t department\t salary\t tax\t extra pay");
		System.out.println("------------------------------------------------------------------------------------");
		Company.printEmployee(employees, true);
		
	}	
		
		public static void printEmployee(Employee[] emp, boolean isTax) {
			
		
			/*for(i=0; i<emp.length;i++){
				System.out.println(emp[i].getName()+"\t\t" + emp[i].getDepartment() +
						"\t\t" + emp[i].getSalary() ); 
						*/
			
			 for(Employee e : emp) {
				System.out.printf("%-17s%-10s%18d", e.getName(), e.getDepartment(),e.getSalary());
				
				if(isTax) {
					System.out.printf("%10.f" ,e.tax());
				}
				
				if(e instanceof Sales) {
					//Sales s = (Sales)e;
					//System.out.printf("18.1f",s.getExtraPay());
					System.out.printf("%10.1f", ((Sales)e).getExtraPay());
				}
				System.out.println();
			}
		}
}

