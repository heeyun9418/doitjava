package Chapter04;

public class BasicLoop {
	public static void main(String[] args) {
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;

		System.out.println("1���� 10������ ���� " + num + "�Դϴ�.");
		
		int cnt = 1;	//cnt=count
		int res = 0;	//res=result
		res += cnt++;	//1 �������꿡 1�� �����ش�.
		res += cnt++;	
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;	//10
		
		System.out.println("1���� 10������ ���� " + res + "�Դϴ�.");
		
		cnt = 1;	//������ �̹� ��������� ���Ǿ����Ƿ� �ʱ�ȭ���ش�.
		res = 0;
		while(cnt <= 10) {
			res += cnt++;
		}
		
		System.out.println("1���� 10������ ���� " + res + "�Դϴ�.");
		
	}
}
