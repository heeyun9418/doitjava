package Chapter07;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 }; // ��� ���� ����ϴ� ���
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) { // length�� ������ ������������ ��밡���ϴ�
			sum1 += arr1[i];
		}
		System.out.println(sum1);

		int[] arr2 = new int[5];// �ڹٿ��� �����ϴ� ���
//		arr2 = {1,2,3}; �ѹ� ������ �迭�� ũ��� �ٲ� �� ����, ���� �迭�� �ٽ� �ʱ�ȭ�� �� ����
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]); // ��ǻ�ʹ� 0���� �����Ѵ�
		} // ���� ������ ������ 0�� ����. �����ڷ����� ��� 0���� �ʱ�ȭ�ȴ�.
			// boolean�� ��� false�� 0�̹Ƿ� false�� �ʱ�ȭ�ȴ�. char�� ���ڷ� ��ȯ�ǹǷ� 0(=null)
			// string�� ��ü�̹Ƿ� null=ó������ �������� �ʾҴ� (���ڰ� �ƴ� ��ü�� null�� �⺻��)
		System.out.println();
		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

		arr1 = new int[] { 1, 2, 3, 4, 5 }; // �ڹٴ� new�� ���θ��� �� �ִ�. ���ο� ��ü�� ���� ����
	}
}
