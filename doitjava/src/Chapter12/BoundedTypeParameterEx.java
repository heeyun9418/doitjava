package Chapter12;

public class BoundedTypeParameterEx {
	public static void main(String[] args) {
//		String str = Util2.compare("a", "b"); (x, String은 Number하위가 아니므로 안됨)
		int result1 = Util2.compare(10, 20);
		System.out.println(result1);

		int result2 = Util2.compare(4.5, 3);	//double이 int보다 크기 때문에 둘 다 double로 적용된다
		System.out.println(result2);

	}
}
