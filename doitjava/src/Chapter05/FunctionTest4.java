package Chapter05;

public class FunctionTest4 {
	public static void main(String[] args) {
		Operator o = new Operator();
//		o.printStar();	//정의해둔 메소드를 호출, 동일작업 반복시 유용하다
		System.out.println(o.add(1, 2));
		System.out.println(o.add(10, 20));
		System.out.println(o.add(30, 20));
	}
}
