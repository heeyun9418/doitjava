package Example;

import java.util.Scanner;

public class HighLowGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int) (Math.random() * 100) + 1;
		int user = 0;
		int cnt = 0;

		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println("1 ~ 100 �� ���������� ���ڸ� ���߼���.");

		while (true) {
			System.out.print("> ");
			user = scan.nextInt();
			System.out.println(++cnt + "ȸ �Է��ϼ̽��ϴ�.");

			if (user > com) {
				System.out.print("�Է��� ���ں��� �۽��ϴ�.");
			} else if (user < com) {
				System.out.print("�Է��� ���ں��� Ů�ϴ�.");
			} else {
				System.out.print("�����Դϴ�. ������ �����մϴ�.");
				scan.close();
				break;
			}
		}
	}
}
