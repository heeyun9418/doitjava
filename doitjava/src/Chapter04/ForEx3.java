package Chapter04;

public class ForEx3 {
	public static void main(String[] args) {
		int i, j;
		for(i = 0; i < 3; i++) {
			for(i = 0; i < 5; i++) {	
				System.out.print("*");	
			}
			System.out.println();
		} //	i�� ��ø�� ������ ���� 5�� �Ǿ��� ������
		  //		���� �ö󰡼� i�� ���� 3���� ũ�� ������ ������� �ʴ´�.
		
		for(i = 0; i < 3; i++) {
			System.out.println("hello!");
		}	//���δٸ� for�������� i���� �ᵵ ������ ���ο����� ���� i�� �� �� ����.
	}
}
