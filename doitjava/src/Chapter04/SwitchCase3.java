package Chapter04;

public class SwitchCase3 {
	public static void main(String[] args) {
		int thisMon = 4;
		System.out.println(thisMon + "���� ������ ���ڴ� �� ���ΰ���?");
		
		switch(thisMon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(thisMon + "���� 31���Դϴ�.");
				break;
			case 2:
				System.out.println(thisMon + "���� 28���Դϴ�.");
				break;
			default:
				System.out.println(thisMon + "���� 30���Դϴ�.");
		} //case�� ��°��� ���� ��� ���ÿ� ����� �� �ִ�.
		
	}
}
