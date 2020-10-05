package Chapter14;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 100; // 예외가 발생했으므로 바로 catch구문으로 넘어간다
			System.out.println("정상범위내에 있습니다.");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // 여러개의 예외를 사용시 |로 구분
			System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어나거나 산술연산에 문제가 발생했습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("finally는 무조건 실행되는 블록입니다."); // 예외와 상관없이 무조건 실행
		}
	}
}
