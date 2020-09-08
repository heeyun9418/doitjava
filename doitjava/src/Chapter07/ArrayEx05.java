package Chapter07;

public class ArrayEx05 {
	public static void main(String[] args) {
		int[] iArr = { 1, 2, 3 };
		String[] sArr = { "일", "이", "삼" };
		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i] + " : " + sArr[i]);
		}

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };
		int[][] array = new int[2][]; // 2차원 배열, 앞쪽에는 반드시 숫자를 입력해야하고 뒷쪽은 생략ㄱㄴ
		array[0] = arr1;
		array[1] = arr2;	//다른 객체로 바꼈기 때문에 윗쪽에서 객체값을 다르게 주더라도 상관없다

		for (int i = 0; i < array.length; i++) {	
//			System.out.println(array[i]);	//array[0], array[1] 출력
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);	//객체의 위치를 알기 위해 중첩for문을 사용해야 한다
			}

		}

	}
}
/*
 * iArr은 힙 영역에 1,2,3 이라는 객체가 생성되어있다 sArr은 글자가 들어있는 String객체가 있다. 배열의 요소가 값일 경우
 * 바로 저장되고 요소가 객체일 경우 객체의 주소가 저장된다. 배열은 객체를 가질 수 있기 때문에 배열이 배열을 가질 수 있다
 */