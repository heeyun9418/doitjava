package Example;

public class ArrayEx01 {
	public static void main(String[] args) {
		char[] cArr = new char[26];
		cArr[0] = 'a';
	
		for(int i = 0; i<cArr.length; i++) {
			cArr[i] = (char)('a' + i);	//int를 char로 형변환해줘야 알파벳이 출력된다
		}
		System.out.println(cArr);
		
	}
}
