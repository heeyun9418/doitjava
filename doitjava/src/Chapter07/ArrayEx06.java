package Chapter07;

public class ArrayEx06 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]); //int배열은 0으로 초기화된다
		}

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}

		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]); //double배열은 실수 0.0으로 초기화 된다
		}

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}

		String[] arr3 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]); //String은 객체라서 null값으로 초기화된다
		}	//null은 처음부터 데이터가 없었다, void는 비어있다는 뜻이다

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}
	}
}
