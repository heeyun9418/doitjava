package Example;
	
import java.util.Scanner;

	//�Է��� ������ ���ٸ� same �ٸ��ٸ� different�� ����ϼ���
public class Exam01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ù ��° ������ �Է��� �ּ���: ");
		int num1 = scan.nextInt();
		System.out.println("�� ��° ������ �Է��� �ּ���: ");
		int num2 = scan.nextInt();
		
		if (num1 == num2) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		if(num1 == num2) System.out.println("Same2");
		else System.out.println("Different2");
		
		System.out.println(num1 == num2 ? "Same3" : "Different3");
		//���� ���� ����̴�(���׿�����)
		//������ ����ϴ� �ͺ��� �������� ǥ���ϴ°� ���� ��µȴ�.
		
		scan.close();
	}
}
