package Example;

import java.util.Scanner;

/*
 * ���� ���� ���� ������ �Է¹޾Ƽ� ����� ����� �� 
 * 100~91 : A���
 * 90~81 : B���
 * 80~71 : C���
 * �������� F���
 * 
 * ��������� ����� ����ϼ���.
 */
public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor=0, eng=0, mat=0;
		
		System.out.print("���� ������ �Է��ϼ���: ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		mat = sc.nextInt();
		char grade = 0;
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
//		if(avg>=91 ) {
//			grade = 'A';
//		} else if (avg>=81) {
//			grade = 'B';
//		} else if (avg>=71) {
//			grade = 'C';
//		} else {
//			grade = 'F';
//		}
		switch((int)avg / 10) {
		case 10 :
		case 9: 
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default :
			grade ='F';
		}
		//switch���� �� ������� �ʴ´�. ����� �ִٴ� ���� �����ֱ� ���� ����غô�. Ȱ�뵵�� ��������.
		
		sc.close();
		System.out.println("����� ��� ������ "+ avg +"���̰� ����� "+ grade +"����Դϴ�.");
	}
}
