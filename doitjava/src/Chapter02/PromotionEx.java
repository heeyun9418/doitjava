package Chapter02;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte , 4����Ʈ �ڷ������� ����ȯ�ȴ�
		System.out.println(intValue);
//		byteValue = intValue; //���� ����Ʈ�� ū ����Ʈ�� ���� �� ����
		
		char charValue = '��';
		intValue = charValue; //char->int
		System.out.println("���� �����ڵ� : " + intValue);
		
		intValue = 200;
		double doubleValue = intValue; //double->int
		System.out.println(doubleValue);
//		intValue = doubleValue;
		
		int result = intValue + byteValue; //���δٸ� �ڷ����� ���� ��� ū �ڷ������� �ڵ���ȯ��
		System.out.println(result);
		
		short shortValue = 100;
		int res = byteValue + shortValue; //�⺻���� ������ int�� int�� ��ƾ��Ѵ�
		
		long longValue = 10000L;
		long res2 = intValue + longValue; //long�� �� ũ�� ������ long�� ����
	}

}




