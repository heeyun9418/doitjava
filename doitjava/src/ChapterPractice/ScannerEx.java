package ChapterPractice;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		int iNum;
		Scanner scan = new Scanner(System.in);	//��ĳ�ʻ����ڵ� - ������ ���� ����(���⼭ scan)
												//�ܺο��� �����͸� �޵��� ä���� ����� ���̴�.
		
//		System.out.println("������ �Է����ּ���:");
//		System.out.print("> ");
//		iNum = scan.nextInt();
//		System.out.println("�Է��� ����: " + iNum);
//		System.out.println();
//		System.out.println("�Ǽ��� �Է��� �ּ���: ");
//		double dNum = scan.nextDouble();
//		System.out.println("�Է��� �Ǽ�: " + dNum);
//		System.out.println();
//		System.out.println("�Ǽ�(f)�� �Է��� �ּ���: ");
//		float fNum = scan.nextFloat();
//		System.out.print("�Է��� �Ǽ�(f): " + fNum);
		System.out.println("���ڿ��� �Է��� �ּ���: ");
//		String str = scan.next();	//���ڿ� �Է¿��� next() ��������� ������ ���� �� ����.
//									//��ĳ�ʿ��� ������ ������ �Է��� �ǹ��Ѵ�.
//		System.out.println("�Է��� ���ڿ� :" + str);
//		str = scan.next();
//		System.out.println("�Է��� ���ڿ�: " + str);
//		str = scan.next();
//		System.out.println("�Է��� ���ڿ�: " + str);

		String str = scan.nextLine();	//�� �� �Է� ��ɾ�� ���鵵 �Է� �����ϴ�.
		System.out.println("�Է��� ���ڿ�: " + str);
		
		scan.close();	//��ĳ�ʴ� �� �̻� ������� ���� ��� �ݾ���� �Ѵ�.
	}
}
