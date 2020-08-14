package Chapter02;

public class CastingEx {

	public static void main(String[] args) {
		int iVal = 44032;
		char cVal = (char) iVal;
		System.out.println(cVal);
		
		long lVal = 500;
		iVal = (int) lVal;
		System.out.println(iVal);
		
		double dVal = 3.14; //정수는 소수를 출력할 체계가 없기 때문에 소수점 이하 숫자는 버림
		iVal = (int) dVal;
		System.out.println(iVal);
		
		int iNum = 103029770;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
	}

}
