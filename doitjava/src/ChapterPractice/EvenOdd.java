package ChapterPractice;

import java.util.Scanner;

/*
 * ���ڸ� �Է� �޾Ƽ� �Է¹��� ���ڰ� Ȧ/¦���� ����ϼ���.
 */
public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		System.out.print("> ");
		
		Scanner scan = new Scanner(System.in);
		int evenNum = scan.nextInt();
				
			if(evenNum % 2 == 0) {
				System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
			} else {
				System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
			}
		scan.close();
	}
}
