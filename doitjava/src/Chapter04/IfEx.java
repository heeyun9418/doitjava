package Chapter04;

public class IfEx {

	public static void main(String[] args) {
		int score = 83;

		if (score >= 90) { // ���ǹ��̳� �ݺ����� ����� ���� {}�� ������ ������ �����ش�.
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else {	//else���� if������ false�� ��� ����Ǵ� �����̴�.
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}

//		if (score < 90)
//			System.out.println("������ 90���� �۽��ϴ�.");
//		System.out.println("����� B�Դϴ�.");
		/*
		 *  {}�� ���� ���� ��� �� �ٸ� ������ �ȴ�.
		 *  ctrl+shift+f�ϸ� �ڵ����� ���ش�.
		 *  "���~B"�� ��� if���� ���Ե��� �����Ƿ� ���� ���Ŀ� ���Ե��� �ʴ´�.
		 *  �׷��� false�� "90���� �۴�"�� ������� �ʴ´�(if���� �����̹Ƿ�)
		 *  if�� ���ǽ��� true�� ��� else�� ���ǽ��� false�� ��� ����ȴ�.
		 */


		System.out.println("false�� if���� ������� �ʽ��ϴ�.");
	}

}
