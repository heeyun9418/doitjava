package Example;

public class ArrayEx01 {
	public static void main(String[] args) {
		char[] cArr = new char[26];
		cArr[0] = 'a';
	
		for(int i = 0; i<cArr.length; i++) {
			cArr[i] = (char)('a' + i);	//int�� char�� ����ȯ����� ���ĺ��� ��µȴ�
		}
		System.out.println(cArr);
		
	}
}
