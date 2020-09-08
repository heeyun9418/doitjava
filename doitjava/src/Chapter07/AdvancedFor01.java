package Chapter07;

public class AdvancedFor01 {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print("(" + i + ")" + arr[i] + " ");
		}
		System.out.println();

		int index = 0;
		for (int num : arr) {
//			타입변수 : 데이터의 집합, 요소를 선택할 수 없다 
//			요소를 하나씩 꺼내서 변수값에 대입한다, 모든 요소를 사용한다 (순서대로)
//			요소를 다 사용하면 for문들 종료한다
			System.out.print("(" + index + ")" + num + " "); //index를 지원하지 않는다
		}
		System.out.println();

		System.out.println();
		int[][] ary = { { 10, 20, 30 }, { 40, 50, 60 } };
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int[] a : ary) {
			for (int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int[] a : ary) {	//자바에서는 Advanced for C언어는 Range-Based for라고 한다
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
