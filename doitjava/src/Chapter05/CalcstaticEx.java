package Chapter05;

public class CalcstaticEx {
	public static void main(String[] args) {
		double result1 = 10 * 10 * CalcStatic.pi;
		int result2 = CalcStatic.plus(10,5);
		int result3 = CalcStatic.minus(10, 5);
		
		CalcStatic calc = new CalcStatic();
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("calcs.pi: " + calc.pi);
		
		int result4 = calc.multiply(10,20); //
		
		CalcStatic calc2 = new CalcStatic();
		
		calc.num1 = 100;
		calc2.num1 = 200;
		System.out.println(calc.num1);
		System.out.println(calc2.num1);

		System.out.println(calc.num2);
		System.out.println(calc2.num2);
		
		calc.num2 = 30;
		System.out.println(calc.num2);

		calc2.num2 = 300;
		System.out.println(calc2.num2);
		
		System.out.println(calc.num2);	//static������ class�� �ҼӵǾ� �������� ����ȴ�
		//num2�� static�����̱� ������ �ؿ� calc2���� num2���� 300���� �ٲ�� ������ �������� ������̴�
		//calc�� num2���� 300���� �ٲ���
	}
}
