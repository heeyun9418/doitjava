package Arsterisk;

public class Arsterisk02 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {	//ù��° ������ j<i�� ��� i=j=0�̹Ƿ� *�� ������� �ʴ´�.
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
