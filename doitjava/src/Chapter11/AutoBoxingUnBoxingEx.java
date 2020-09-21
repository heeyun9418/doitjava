package Chapter11;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// 대입시 자동 Boxing
		int value = obj;
		System.out.println("value: " + value);

		// 연산시 자동 Boxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
