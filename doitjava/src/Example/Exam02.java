package Example;

import java.util.Scanner;

	//����1���� �о� ¦/Ȧ�� �Ǻ��ϼ���
public class Exam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		int num1 = scan.nextInt();
		System.out.println(num1 % 2 == 0 ? "¦��" : "Ȧ��");
		
		if (num1 % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		if (num1 % 2 == 0) System.out.println("¦������");
		else System.out.println("Ȧ������");
		
		String str = "";
		if (num1%2==0) {
			str = "¦��";
		} else {
			str = "Ȧ��";
		}
		System.out.println(str); //str�� ���õ� ��
		
		scan.close();
	}
}
