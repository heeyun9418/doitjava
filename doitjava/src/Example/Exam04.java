package Example;
	//1~10���� ¦���� ���� ���Ͻÿ� -30
public class Exam04 {
	public static void main(String[] args) {
		int sum = 0;
					
		 for(int i = 1; i <=10; i++) {
			 if(i % 2 == 0) {
			 	 sum += i;
			 }
		 }
		System.out.println("1���� 10������ �� �� ¦���� ���� " + sum + "�Դϴ�.");
	}
}