package Chapter04;

public class ForEx {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num < 11) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		int i = 0;	//i=index �ַ� Ƚ���� ǥ���Ѵ�.
		int res = 0;
		for(i = 1; i < 11; i = i + 1) {	//�ʱ�ȭ�� ���ʿ� �ѹ��� �����. ���� ��쿡�� �ݺ��Ѵ�
			res +=
					i;
		}
		System.out.println(res);
	}
}

/*
 * �������� ���� ���� �����̴�
 * i++ -> i += 1 -> i = i + 1
 */




