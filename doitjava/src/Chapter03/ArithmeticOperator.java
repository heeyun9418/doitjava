package Chapter03;

public class ArithmeticOperator { //���������

	public static void main(String[] args) {
		int iRes; //Resert = Res�� �ٿ�����
		double dRes;
		
		iRes = 3+2;
		System.out.println(iRes);
		iRes = 3-2;
		System.out.println(iRes);
		iRes = 3*2;
		System.out.println(iRes);
		iRes = 3/2; // /�� ���� ���� ���´�
		System.out.println(iRes);
		dRes = 3.0/2.0; // �Ǽ��� ��� �Ҽ��� ���� ����� �� �ִ�
		System.out.println(dRes);
		iRes = 3%2; // %�� ������ ���� ���´�
		System.out.println(iRes);
		
		dRes = 3/2; // 3�� 2 ��� ������ ������ ���� 1�� �������� double�� ����ȯ�ȴ�
		System.out.println(dRes);
		dRes = (double)3/2; //3�տ� double�� �پ� �Ǽ��� �Ǿ����Ƿ� �Ǽ������� �Ǽ��� ���ȴ�
		System.out.println(dRes);
		
		//0.0�� 0���� �������� �ʾƼ� ����/0.0�� �ϸ� infinity�� ��µȴ�
	}

}
