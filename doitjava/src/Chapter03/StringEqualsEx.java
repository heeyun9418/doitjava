package Chapter03;

public class StringEqualsEx {
	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");
/*
 * str1과 str2는 같은 객체 주소에 저장됨
 * str3는 새로운 String(주소)를 입력했기 때문에 str1,2와는 다른 곳에 저장됨
 * 연산자(=,>,< 등)는 주소값을 비교한다
 * 출력되는 값은 "자바"로 같다
 * equals를 입력하면 출력되는 값이(주소가 아님) 같은지 다른지 알 수 있다
 * 실제로 스택은 str1,str2,str3순으로 쌓인다 (str3값을 먼저 사용함)
 */
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}
}
