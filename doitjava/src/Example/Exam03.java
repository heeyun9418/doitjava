package Example;
	//1~10������ ���� ���ϼ���
public class Exam03 {
	public static void main(String[] args) {
		int i;
		int sum;
		
		for(i = 1, sum = 0; i<=10; i++) {
			sum += i;
		}				
		System.out.println("������ ���� " + sum + "�Դϴ�.");
		
		int sum2 = 0;
		for (int i2=1; i2<=10; i2++) {
			sum2 += i2;
		}
		System.out.println("1���� 10������ ���� "+sum2+"�Դϴ�.");
	}
}
