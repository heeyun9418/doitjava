package Example;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ϴ� ���� �� ���Դϱ�?");
		int month = sc.nextInt();
		int day = 0;
		
		switch (month) {
			case 2 : 
				day = 28;
				break;
			case 1 : case 3 : case 5 : case 7: case 8 : case 10 : case 12 :
				day = 31;
				break;
			default :
				day = 30;
		}
		System.out.println( month +"����" + day +  "���Դϴ�.");
		sc.close();
	}
}
