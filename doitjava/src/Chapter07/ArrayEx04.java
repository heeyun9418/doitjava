package Chapter07;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
//		arr1= {10,20,30,40,50}; �߰�ȣ�� �ʱ�ȭ�� ���� ��밡��
		arr1[0] = 10; // �迭�� ��ҵ��� ��� ����ó�� ��밡���ϴ�
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();

		int[] arr2 = new int[10];
		System.out.println(arr2.length);

		arr2 = arr1; // ���� �� �޸��� �ּҰ� �ٲ���
		System.out.println(arr2.length);
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println();
		int a = 10;
		int b = 20;
		b = a; // b�� 10�̶�� ���� �����ϰ� �ִ�
		System.out.println(b);

		arr2 = new int[] { 100, 200, 300 };
//		arr2 = {10,20,30}; {}�� ������ �ʱ�ȭ���� ����� �����ϴ�
		// �迭�� �迭�� ������ �� �ֱ� ������ ���ο� �迭��(new) ���� �����ϴ� �͵� �����ϴ�
	}
}
