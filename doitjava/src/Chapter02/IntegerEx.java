package Chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000; //��ǻ�ʹ� _(�����)�� �ν����� �ʴ´�
		short sNum2 = 10000;
		int iNum = 1_000_000_000;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum2);
		System.out.println(iNum);
//		bNum = 200; //byte �ڷ����� -128~127���� ����� �� �ִ�
		/*
		 * �ּ�ó�� ����Ű
		 * ctrl+shift+c
		 * ctrl+/
		 * ctrl+7
		 */
		
//		sNum = 4_0000; //short�� -32768~32867 ���� ����� �� �ִ�
		
//		iNum = 22_0000_0000; //-2,147,483,648~2,147,483,647 ���� ��� ����(�뷫21��)
		System.out.println(1_000_000_000); //���꿡���� ,���� _�� ��� �ν����� x
		System.out.println(3_000_000_000L); 
//		long�� ���ڸ� ǥ���� �� �빮�ڸ� ��� ���ڿ� ������ �� �ִ�
//		21���� �Ѿ�� ���ڵڿ� ����L�� �ٿ��ָ� long�� �ڷᰡ �ȴ�
		
		int result;
		result = sNum + bNum;
		
		long lNum = 3_000_000_000L; 
		System.out.println(lNum);
//		int������ �Ѿ�� ���ڿ��� ������ L�� �ٿ��ش�
		
		
	}

}
