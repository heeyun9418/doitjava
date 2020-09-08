package Chapter07;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
//		arr1= {10,20,30,40,50}; 중괄호는 초기화할 때만 사용가능
		arr1[0] = 10; // 배열의 요소들은 모두 변수처럼 사용가능하다
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();

		int[] arr2 = new int[10];
		System.out.println(arr2.length);

		arr2 = arr1; // 대입 후 메모리의 주소가 바꼈다
		System.out.println(arr2.length);
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println();
		int a = 10;
		int b = 20;
		b = a; // b가 10이라는 값을 저장하고 있다
		System.out.println(b);

		arr2 = new int[] { 100, 200, 300 };
//		arr2 = {10,20,30}; {}는 최초의 초기화에만 사용이 가능하다
		// 배열에 배열을 대입할 수 있기 때문에 새로운 배열을(new) 만들어서 대입하는 것도 가능하다
	}
}
