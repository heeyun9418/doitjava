package Example;
	//1~100���� ��� , 3�ǹ���� ping, 5�� ����� pong�� ����Ͻÿ�
public class Pingpong {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i + " PingPong");
			} else if (i % 5 == 0) {
				System.out.println(i + " Pong");
			} else if (i % 3 == 0) {
				System.out.println(i + " Ping");
			} else {
				System.out.println(i);
			}
		} System.out.println();
//		if�������� �̹� ��/������ �Ǻ��� ���ڴ� ������ ���� else if/els ��������
//		�Ѿ�� ������ ����� ���� ���� �Ǻ��ؾ��Ѵ�
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if(i % 3 == 0) {
				System.out.print("Ping");
			}
			if(i % 5 == 0) {
				System.out.print("Pong");
			}
			System.out.println();
		}
	}
}
