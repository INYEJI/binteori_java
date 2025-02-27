package ch01.ex02;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X값 입력 : ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX); //string 타입을 int 타입으로 변환
		
		System.out.print("Y값 입력 : ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x+y:" + result);
		System.out.println();
		
		while(true) { //다음이 진짜이면 무한 반복하고 (1)
			System.out.print("입력 문자열: ");
			String data = sc.nextLine();
			if(data.equals("q")) { //string 타입 값이 동일한지 물을 때는 equals(문자열)를 사용
				break; //*만약 string값이 q와 동일하면 멈춰라, while문을 벗어남*
			}
			System.out.println("출력 문자열: " + data); //데이터를 출력해라(2)
			System.out.println();
		}

		System.out.println("종료"); //멈추고 종료 출력
	}

}
