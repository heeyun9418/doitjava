package Chapter03;

public class ArithmeticOperator { //산술연산자

	public static void main(String[] args) {
		int iRes; //Resert = Res로 줄여쓴다
		double dRes;
		
		iRes = 3+2;
		System.out.println(iRes);
		iRes = 3-2;
		System.out.println(iRes);
		iRes = 3*2;
		System.out.println(iRes);
		iRes = 3/2; // /는 몫의 값이 나온다
		System.out.println(iRes);
		dRes = 3.0/2.0; // 실수일 경우 소수점 까지 출력할 수 있다
		System.out.println(dRes);
		iRes = 3%2; // %는 나머지 값이 나온다
		System.out.println(iRes);
		
		dRes = 3/2; // 3과 2 모두 정수기 때문에 몫인 1이 나오지만 double로 형변환된다
		System.out.println(dRes);
		dRes = (double)3/2; //3앞에 double이 붙어 실수가 되었으므로 실수나누기 실수로 계산된다
		System.out.println(dRes);
		
		//0.0을 0으로 생각하지 않아서 정수/0.0을 하면 infinity가 출력된다
	}

}
