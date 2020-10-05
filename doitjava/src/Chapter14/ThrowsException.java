package Chapter14;

public class ThrowsException {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("java.lang.String");
		System.out.println("프로그램을 종료합니다");
		try {
			throw new ArithmeticException("Message"); // 예외객체를 만들어서 던진다
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
