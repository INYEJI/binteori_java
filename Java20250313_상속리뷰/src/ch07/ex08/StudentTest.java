package ch07.ex08;

public class StudentTest {

	public static void main(String[] args) {
		
		Student arr[] = new Student[3];
		
		arr[0] = new Student("홍길동", 20, 171, 81, "201101", "영문");
		arr[1] = new Student("고길동", 21, 183, 72, "201102", "건축");
		arr[2] = new Student("박길동", 22, 175, 65, "201103", "컴공");
		
		for(int i=0; i<arr.length; i++) {
			String result = arr[i].printInformation();
			System.out.println(result);
		}
	
		
		

	}

}
