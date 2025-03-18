package ex03;

public class ArrayCopyExample {

	public static void main(String[] args) {

		/*int[] oldIntArray = new int[] {10,20,30,40,50}; (1)int[]배열에 직접 값 입력
		int[] oldIntArray2 = new int[5]; (2)int[] 배열에 값의 갯수를 입력하고, 인덱스 번호로 값 지정
		oldIntArray2[0] = 10; 
		*/
		
		int[] oldIntArray = {1,2,3}; //기존 배열 = 3개짜리
		
		System.out.println(oldIntArray.length);
		
		int[] newIntArray = new int[6]; //새 배열 = 6개짜리로 이동
		
		//for문을 이용한 배열복사(새로운 큰 배열을 만들어 기존의 배열의 값을 이동시킨다)
		for (int i=0; i<oldIntArray.length; i++) { //oldIntArray => newIntArray 로
			newIntArray[i] = oldIntArray[i]; //oldIntArray.length수 만큼 newIntArray[i]에 값 복사
		}
		
		for(int i=0; i<newIntArray.length; i++) { //새로운 배열의 항목들을 출력한다. = newIntArray[i]
			System.out.print(newIntArray[i] + " "); //출력시 항목이 들어가지 않은 부분은 초기값인 0이 출력된다.
		}
		
		int[] intArray = new int[10];
		//arraycopry를 통한 배열복사
		System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length);
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		//향상된 for문
		for(int i : intArray) {
			System.out.print(i + " ");
		}
	}

}
