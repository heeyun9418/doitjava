package Example;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?");
		int line = scan.nextInt();
		for(int i=line-1; i>=0; i--) {	//�ܺο� �ִ� for���� ���ҽ����� �ٲ��ش�//j<=i�� �ص� ���� ����� ���´�
			for(int j=0; j<=i; j++) {
				System.out.print("$");
			}
			System.out.println();
		} scan.close();
		
//		for(int i=9; i>=0; i--) {
//			System.out.println(i);
		}
	}

