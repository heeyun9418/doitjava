package Example;

import java.util.Random;
import java.util.Scanner;

public class RSPGame2 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	String[] str = new String[] {"��", "��", "��"}; // ���� �����Ѱ� ���� ������ֱ� ����
	int user, com;
	
		while(true) {
			System.out.println("1. ��, 2. ��, 3. ��, 0. ����");
			System.out.print("���ڸ� �Է����ּ��� ");
			
			user = scan.nextInt(); // ���� ����
			if(user < 0 || 3 < user) { // ���� �� �� �����ߴٸ�
				System.out.println("�� �� �����ϼ̽��ϴ�.\n");
				continue;
			}
			if(user == 0) { // 0�� ���������� ���α׷� ����
				System.out.println("�����մϴ�.\n");
				break;
			}
			
			com = rand.nextInt(2)+1; // ��ǻ�� ����(�����߻�)

			if(user == com) { // ���� ���� ���� �����ϼ��� ��..
				System.out.println("����� " + str[user-1] + "��ǻ�ʹ� " + str[com-1]);
				System.out.println("���� �����ϴ�.\n");
			}
			else if(user==3 && com==1) { // ������ ��, ��ǻ�Ͱ� �� ���ý�..
				System.out.println("����� " + str[user-1] +  "��ǻ�ʹ� " + str[com-1]);
				System.out.println("����� �̰���ϴ�.\n");
			}
			else if(user < com) { // ���� ��, ��ǻ�� �� or ���� ��, ��ǻ�� �� ���ý�
				System.out.println("����� " + str[user-1] +  "��ǻ�ʹ� " + str[com-1]);
						System.out.println("����� �̰���ϴ�.\n");
			}
			else { // �׿� ������ ���� ��..
				System.out.println("����� " + str[user-1] + "��ǻ�ʹ� " + str[com-1]);
				System.out.println("����� �����ϴ�.\n");
			}
		
		}
	}
}
