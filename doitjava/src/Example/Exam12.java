package Example;

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��? ");
		int line = scan.nextInt();
		for(int i=0; i<line; i++) {	//ù��°���� 0���� ������ �Ѵ�(¦����)
			for(int j=0; j<i+1; j++) {	//j<=i�� �ص� ���� ����� ���´�
				if (j % 2 == 0) {
					System.out.print("$");
				} else {
					System.out.print("��");
				}
			}		
			System.out.println();
		} scan.close();
	}
	
}
