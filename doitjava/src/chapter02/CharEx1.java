package chapter02;

public class CharEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
//		ch1 = 'BC' //char 자료형은 1개의 문자만 입력 가능하다
		int num1 = ch1;
		System.out.println(num1); //대문자A는 숫자65와 같다
		
		char ch2 = 66;
		char ch3 = 67;
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = 'a';
		int num4 = ch4;
		System.out.println(num4);
		
		System.out.println('a' - 'A');
	}

}
