package JavaTest;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] Arr = new Student[3];
		
		Arr[0] = new Student("홍길동",20,171,81,"201101","영문");
		Arr[1] = new Student("고길동",21,183,72,"201102","건축");
		Arr[2] = new Student("박길동",22,175,65,"201103","컴공");
		
		for(int i=0; i<Arr.length; i++) {
			String result = Arr[i].printInformation();
			System.out.println(result);
		}

	}

}

