package Example;
	//1~50������ �� �߿� 3�� ����� �հ踦 ���Ͻÿ� -408
	//n�� ������� ���ڸ� n���� ������ �� �������� 0�̸� n�� ����̴�.
public class Exam05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++)
			if(i % 3 == 0) {
				sum += i;				
			}
			System.out.println("1���� 50������ �� �߿��� 3�� ����� ���� "+sum+"�Դϴ�.");
	}
}
