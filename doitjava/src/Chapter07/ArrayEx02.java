package Chapter07;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 }; // 모든 언어에서 사용하는 방법
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) { // length는 지정된 범위내에서만 사용가능하다
			sum1 += arr1[i];
		}
		System.out.println(sum1);

		int[] arr2 = new int[5];// 자바에서 선언하는 방법
//		arr2 = {1,2,3}; 한번 정해진 배열의 크기는 바꿀 수 없고, 사용된 배열은 다시 초기화할 수 없다
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]); // 컴퓨터는 0부터 시작한다
		} // 값을 정하지 않으면 0이 들어간다. 숫자자료형은 모두 0으로 초기화된다.
			// boolean의 경우 false가 0이므로 false로 초기화된다. char도 숫자로 변환되므로 0(=null)
			// string은 객체이므로 null=처음부터 존재하지 않았다 (숫자가 아닌 객체는 null이 기본값)
		System.out.println();
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

		arr1 = new int[] { 1, 2, 3, 4, 5 }; // 자바는 new로 새로만들 수 있다. 새로운 객체를 만들어서 연결
	}
}
