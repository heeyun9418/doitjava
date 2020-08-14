package Chapter02;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte , 4바이트 자료형으로 형변환된다
		System.out.println(intValue);
//		byteValue = intValue; //작은 바이트에 큰 바이트를 담을 수 없다
		
		char charValue = '가';
		intValue = charValue; //char->int
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 200;
		double doubleValue = intValue; //double->int
		System.out.println(doubleValue);
//		intValue = doubleValue;
		
		int result = intValue + byteValue; //서로다른 자료형을 더할 경우 큰 자료형으로 자동변환됨
		System.out.println(result);
		
		short shortValue = 100;
		int res = byteValue + shortValue; //기본적인 연산은 int라서 int에 담아야한다
		
		long longValue = 10000L;
		long res2 = intValue + longValue; //long이 더 크기 때문에 long에 저장
	}

}




