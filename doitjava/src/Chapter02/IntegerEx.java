package Chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000; //컴퓨터는 _(언더바)를 인식하지 않는다
		short sNum2 = 10000;
		int iNum = 1_000_000_000;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum2);
		System.out.println(iNum);
//		bNum = 200; //byte 자료형은 -128~127까지 사용할 수 있다
		/*
		 * 주석처리 단축키
		 * ctrl+shift+c
		 * ctrl+/
		 * ctrl+7
		 */
		
//		sNum = 4_0000; //short는 -32768~32867 까지 사용할 수 있다
		
//		iNum = 22_0000_0000; //-2,147,483,648~2,147,483,647 까지 사용 ㄱㄴ(대략21억)
		System.out.println(1_000_000_000); //연산에서는 ,말고 _를 써야 인식하지 x
		System.out.println(3_000_000_000L); 
//		long형 숫자를 표기할 때 대문자를 써야 숫자와 구분할 수 있다
//		21억이 넘어가면 숫자뒤에 영어L을 붙여주면 long형 자료가 된다
		
		int result;
		result = sNum + bNum;
		
		long lNum = 3_000_000_000L; 
		System.out.println(lNum);
//		int범위를 넘어가는 숫자에는 무조건 L을 붙여준다
		
		
	}

}
