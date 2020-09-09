package Chapter05;

public class FunctionTest5 {
	public static void main(String[] args) {
		Obj obj = new Obj();
		int res = obj.add(1,2);
		System.out.println(res);
	}
}	

class Obj {
	int add(int a, int b) {
		return a + b +c;
	}
	int c = 10;	//아래쪽에서 선언해도 객체값은 존재하기 때문에 값을 반환할 수 있다
}