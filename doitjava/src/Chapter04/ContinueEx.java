package Chapter04;

public class ContinueEx {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello!" + i);
			if(i == 1) {
//				break;	//i���� 1�� ���� �� for���� break�Ѵ� (if���� break�� �� ���� ������)
				continue;	//i�� 1�� ���� ��� ������� ���� ���� �ߴ��ϰ� ���������� �Ѿ��.
			}
			System.out.println("���..");
		}
		
		int cnt = 0;
		while(true) {
			System.out.println("while" + cnt++);	//cnt�� ������Ű�� ������ ���ѹݺ��ȴ�.
			if(cnt == 5) {
//				break;
				continue;	//4�� ����� 5�� �Ǿ��� ������ ���ǽ����� �Ѿ��
			}
			System.out.println("���..");
			if(cnt == 10) {
				break;
			}
		}
	}
}
