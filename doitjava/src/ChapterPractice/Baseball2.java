package ChapterPractice;

import java.util.Scanner;

public class Baseball2 {
	public static void main(String[] args) {
		int com[] = new int[3]; // ��ǻ���� �迭 3��
		int user[] = new int[3]; // ������� �迭 3��
		int ch = 0;
		int cnt = 0;

		boolean randomball = true;

		while (randomball) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;
			}
			if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
				randomball = false; // ���ڸ� ����µ� 3�ڸ� ���ڰ� �� �ٸ����ؼ� while���� Ż���� �� �ֵ���
			}
		}
		randomball = true;

		System.out.println("�߱����� ����");
		while (randomball) {
			int strike = 0;
			int ball = 0;
			System.out.println("���ڸ� �Է��ϼ���");
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < user.length; i++) {
				try {
					ch = sc.nextInt();
					user[i] = ch;
					if (ch > 10 || ch < 0) {
						System.out.println("1~9�� ���ڸ� �Է��ϼ���");
					}
				} catch (Exception e) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}
			for (int i = 0; i < com.length; i++) { // ��ǻ�͹迭(����)�� ����ڹ迭(����)�� ����
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) { // �迭��(����)���� ��ġ���� ������ ��Ʈ����ũ
						strike++;
					} else if (com[i] == user[j] && i != j) { // �迭��(����)���� ��ġ�� �ٸ��� ��
						ball++;
					}
				}
			}
			System.out.println(strike + "��Ʈ����ũ  " + ball + "��");
			if (strike == 3) { // ��Ʈ����ũ�� ������ ����ٴ� ���̴ϱ� �������� �� �ֵ���
				randomball = false;
			}
			cnt++;
		}
		System.out.println("Ƚ�� : " + cnt);
		System.out.println("���� ��");
	}

}
