package Chapter11;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		// �ڵ� Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// ���Խ� �ڵ� Boxing
		int value = obj;
		System.out.println("value: " + value);

		// ����� �ڵ� Boxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
