package ch06.ex04;

public class MainStudent {

	public static void main(String[] args) {
		
		//1.Student 객체 생성하면서 이름(홍길동), 학년(3), 나이(20) 입력
		Student st = new Student("홍길동", 3, 20);
		//2.printInfo() 메소드 호출
		st.printInfo();
		//3.이름을 이순신으로 변경
		st.setName("이순신");
		//4.변경된 이름만 출력
		String name = st.getName();
		System.out.println(name);
		//5.학년 5로 변경
		st.setGrade(5);
		//6.변경된 학년만 출력
		int grade = st.getGrade();
		System.out.println(grade);
		
			
			
		}

	}


