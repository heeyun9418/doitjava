package Chapter07;

public class ArrayEx05 {
	public static void main(String[] args) {
		int[] iArr = { 1, 2, 3 };
		String[] sArr = { "��", "��", "��" };
		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i] + " : " + sArr[i]);
		}

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };
		int[][] array = new int[2][]; // 2���� �迭, ���ʿ��� �ݵ�� ���ڸ� �Է��ؾ��ϰ� ������ ��������
		array[0] = arr1;
		array[1] = arr2;	//�ٸ� ��ü�� �ٲ��� ������ ���ʿ��� ��ü���� �ٸ��� �ִ��� �������

		for (int i = 0; i < array.length; i++) {	
//			System.out.println(array[i]);	//array[0], array[1] ���
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);	//��ü�� ��ġ�� �˱� ���� ��øfor���� ����ؾ� �Ѵ�
			}

		}

	}
}
/*
 * iArr�� �� ������ 1,2,3 �̶�� ��ü�� �����Ǿ��ִ� sArr�� ���ڰ� ����ִ� String��ü�� �ִ�. �迭�� ��Ұ� ���� ���
 * �ٷ� ����ǰ� ��Ұ� ��ü�� ��� ��ü�� �ּҰ� ����ȴ�. �迭�� ��ü�� ���� �� �ֱ� ������ �迭�� �迭�� ���� �� �ִ�
 */