package Chapter04;

public class SwitchCase2 {
	public static void main(String[] args) {
		int now = 10;
		
		System.out.println("���� �ð��� " + now + "���Դϴ�.");
		System.out.println("���� ������ ������ �����ϴ�.");
		
		switch(now) {
			case 9:
				System.out.println("9�ÿ��� ����� �մϴ�.");
			case 10:
				System.out.println("10�ÿ��� ��ħ ��ȸ�� �մϴ�.");
			case 11:
				System.out.println("11�ÿ��� ���� ������ �����մϴ�.");
			case 12:
				System.out.println("12�ÿ��� ������ �Խ��ϴ�.");
		}
		/*
		 * case�� ���� �� break�� ��� ���� case�� �Ѿ��
		 * break�� ������ case�� �����ϸ鼭 ������ ���� ������ ������ ���� case�� ����x�Ѵ�.
		 * now���� 8�ϰ��� ������� �ʴ´�.(case�� �������� �ʱ� ������)
		 * case�� �ִ� ���� ����ǰ� ���� ��� default���� ���� ��� ����ȴ�.
		 * java������ switch�� ���ڿ��� ����� �� �ִ�. (�ٸ� ���α׷��� ���ڸ� ��)
		 */
		
		String pos = "�븮";
		switch(pos) {
			case "����":
				System.out.println("������ ������ 400�����Դϴ�.");
				break;
			case "����":
				System.out.println("������ ������ 300�����Դϴ�.");
				break;
			case "�븮":
				System.out.println("�븮�� ������ 200�����Դϴ�.");
			default:
				System.out.println("�Ϲݻ���� ������ 150�����Դϴ�.");
		}
//		default�ؿ� �ִ� case�� ������� �ʴ´�.
	}
}
