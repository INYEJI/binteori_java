package ch04.ex01;

import java.util.Scanner;

public class ForExam4_배열5 {

	public static void main(String[] args) {
		//[]명의 점수를 입력 받아서 총점 평균 구하기
		
		int[] num = new int[] {99,88,77,55,44,33,22}; //깂이 이미 들어가있음, 배열 변수 선언 = new 타입[]{값들} 이렇게 한 번에 처리 할 수도 있고
		//int[] xyz = {값들} **배열 변수를 먼저 선언한 후에는 값 목록을 대입 할 수 없음!
		//int[] xyz = new int[]{값들}
		//11행과 12행은 같다
		
 		int sum = 0;
		int i;
		int max = 0; //변수 초기값 { }에 있는 것보다 작은 값 입력
		int min = 1000; //min이 출력되려면 { }에 있는 것보다 큰 값 입력
		
		//int[] a = new int[6]; //[]안에 있는 숫자만큼 갯수 , int만 가능하고 실수를 하고 싶으면 double이용
		
		for (i=0; i<7; i++) {
			sum += num[i]; //sum에 num[]값을 i<5까지 누적
		}
		
		double avg = sum/(i);
		System.out.printf("총점: %d, 평균: %.2f\n", sum ,avg);
		System.out.println(num[6]);
		
		int abc = num[6];
		System.out.println(abc); //그 번호 위치에 있는 값 출력
		System.out.println(i); //인덱스 즉 값의 번호 출력
		
		
		System.out.println("-------------------");
		
		//max = num[0] 임의로 하나를 max라고 지정
		//min = num[0] 임의로 하나를 min이라고 지정
		
		for(i=0; i<7; i++) {
			if(max <= num[i]) {
				max = num[i];}
			
			if(min >= num[i]) //min값이 0이기때문에 0보다 작은 건 없어서 값이 안나옴
				min = num[i];
			}
			System.out.println(max);
			System.out.println(min);
			

			System.out.println("-------------------");
			
			/*
			 * {-1,-3,700,1,2,9,3}
			 * 키보드 1 입력하면 출력 : 1값은 4번째 위치 입니다.
			 */
			
			
			int index = -1; //0으로 하면 안 되는 이유는 인덱스가 0부터 시작하기 때문이고 그렇게 되면 밑의 else문을 만족하게 되어 값을 못찾는다고 나옴
			int[] key = new int[]{-1,-3,-700,1,2,9,3}; //타입[] 변수명 = new 타입 []{값0,값1,값2...} 이런식으로 0부터 시작
			Scanner sc = new Scanner(System.in);
			System.out.print("키보드 숫자를 입력하시오 : "); 
			int number = sc.nextInt(); //값 입력받음 => 숫자가 number에 저장
			
			
			for(int j = 0 ; j<7 ;  j++ ) { //j가 0부터 7 미만까지 계속 반복
				if(number == key[j]) { //만족했다면 값을 찾았다는 의미 : 즉 키보드로 입력 받은 숫자가 그 값 번호 위치에 있는 값과 동일할 경우에만 index에 j값을 저장한다
					index = j;
					break; //break를 걸 경우 밑으로 빠져나감
				}
			}
			
			//만약 if문을 만족하지 못하면 빠져나와 index 값을 계속 -1로 가진다
			
			if(index != -1) { // index값이 변했다면(-1이 아니라면) , 값을 찾았다는 뜻이므로 밑에 줄 출력 
				System.out.printf("%d값은 %d번째 위치입니다.\n", number, index+1);
			} else { //변하지 않았다면 값을 못 찾은 것
				System.out.printf("%d값은 찾을 수 없습니다.\n", number);
			}
			
			
			
			System.out.println("-------------------");
			
			
	}
			}

			
		
		
			
		
