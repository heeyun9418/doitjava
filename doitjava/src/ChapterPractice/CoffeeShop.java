package ChapterPractice;

import java.util.Scanner;

public class CoffeeShop {
	public static void main(String[] args) {
		System.out.println("���ٹ��Դϴ�.");
		System.out.println("�޴��� �ֹ��� �ּ���.");
		Scanner scan = new Scanner(System.in);
		String menu = "";
		System.out.println("A: �Ƹ޸�ī��, M: ī���ī, C: ĳ���Ḷ���ƶ�, T: ������ Ŀ��");
		System.out.print("> ");
		menu = scan.next();
		menu = menu.toUpperCase();
		System.out.println(menu);	//���ڸ� �빮�ڷ� �������ش�.
		//toLowerCase() ���ڸ� �ҹ��ڷ� �������ش�.

		
		switch(menu) {
			case "A" : 
				System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.");
				break;
			case "M": case "m" :
				System.out.println("ī���ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case "C": case "c" :
				System.out.println("ĳ���Ḷ���ƶǸ� �ֹ��ϼ̽��ϴ�.");
				break;
			case "T": case "t" :
				System.out.println("������ Ŀ�Ǹ� �ֹ��ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("���� �޴��Դϴ�. �ٽ� �������ּ���.");
		}
		scan.close();
	}
}
