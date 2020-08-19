package Chapter04;

public class SwitchCase3 {
	public static void main(String[] args) {
		int thisMon = 4;
		System.out.println(thisMon + "월의 마지막 일자는 몇 일인가요?");
		
		switch(thisMon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(thisMon + "월은 31일입니다.");
				break;
			case 2:
				System.out.println(thisMon + "월은 28일입니다.");
				break;
			default:
				System.out.println(thisMon + "월은 30일입니다.");
		} //case의 출력값이 같을 경우 동시에 사용할 수 있다.
		
	}
}
