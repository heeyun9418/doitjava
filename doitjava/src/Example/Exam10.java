package Example;

import java.util.Scanner;

//1~7���� $������ ���ʷ� �����Ͽ� ��Ÿ������ ���α׷��� �Ͻÿ�
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?");
		int line = scan.nextInt();
		for(int i=0; i<line; i++) {
			for(int j=0; j<i+1; j++) {	//j<=i�� �ص� ���� ����� ���´�
				System.out.print("$");
			} 
			System.out.println();
		} scan.close();
	}
}
