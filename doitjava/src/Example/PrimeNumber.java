package Example;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = scan.nextInt();
		
			boolean PrimeNumber = true;

			for (int i=2; i<num; i++) {
				if(num%i==0) {
					PrimeNumber = false;
				}
			}

			if (PrimeNumber) {
			System.out.println("�Է��� ���� "+ num + "��(��) �Ҽ��Դϴ�.");

			} else {
			System.out.println("�Է��� ���� "+ num + "��(��) �Ҽ��� �ƴմϴ�");			
			} scan.close();
	}
}
