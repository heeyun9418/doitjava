package Chapter07;

public class ArrayEx06 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]); //int�迭�� 0���� �ʱ�ȭ�ȴ�
		}

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]);
		}

		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]); //double�迭�� �Ǽ� 0.0���� �ʱ�ȭ �ȴ�
		}

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]:" + arr2[i]);
		}

		String[] arr3 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]); //String�� ��ü�� null������ �ʱ�ȭ�ȴ�
		}	//null�� ó������ �����Ͱ� ������, void�� ����ִٴ� ���̴�

		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}
	}
}