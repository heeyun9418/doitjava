package Chapter03;

public class StringEqualsEx {
	public static void main(String[] args) {
		String str1 = "�ڹ�";
		String str2 = "�ڹ�";
		String str3 = new String("�ڹ�");
/*
 * str1�� str2�� ���� ��ü �ּҿ� �����
 * str3�� ���ο� String(�ּ�)�� �Է��߱� ������ str1,2�ʹ� �ٸ� ���� �����
 * ������(=,>,< ��)�� �ּҰ��� ���Ѵ�
 * ��µǴ� ���� "�ڹ�"�� ����
 * equals�� �Է��ϸ� ��µǴ� ����(�ּҰ� �ƴ�) ������ �ٸ��� �� �� �ִ�
 * ������ ������ str1,str2,str3������ ���δ� (str3���� ���� �����)
 */
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}
}
