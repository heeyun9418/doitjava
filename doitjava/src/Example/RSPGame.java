package Example;

import java.util.Scanner;

public class RSPGame {
	public static void main(String[] args) {
		final int SCISSOR = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		int score = 0;
		int life = 3;
		int user, com;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �� �����Դϴ�.");
		while (true) {
			com = (int)(Math.random()*3);
			System.out.println("0: ����, 1: ����, 2: ��");
			System.out.print(">");
			user = sc.nextInt(); //0,1,2 ���� ���� ���Է��ϵ���
				
		/*����� ���*/
		System.out.println("��ǻ�� : "+ (com == 0 ? "����" : (com == 1 ? "����" : "��")));
		System.out.println("���� : " + (user == 0 ? "����" : (user == 1 ? "����" : "��")));
		
			if((com==SCISSOR && user==ROCK) || (com==ROCK && user==PAPER) || (com==PAPER && user==SCISSOR)) {
				 System.out.println("�̰���ϴ�.");
				 score += 100;
			} else if (com == user) {
				System.out.println("�����ϴ�.");
				score += 10;
			} else  {
				System.out.println("�����ϴ�.");
				life--;
			} 
			/*���� ������ ���� ��� ���*/
			System.out.println("�������� : " + score);
			System.out.println("���� ������ : " + life);
			
			/*���� ����� 0�̵Ǹ� ��������*/
			if (life == 0) {
				System.out.println("life�� 0�� �Ǿ� ������ �����մϴ�.");
				sc.close();
				break;
			}
			System.out.println();
		}
	}
}
