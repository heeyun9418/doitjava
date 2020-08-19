package Chapter04;

public class SwitchCase2 {
	public static void main(String[] args) {
		int now = 10;
		
		System.out.println("현재 시간은 " + now + "시입니다.");
		System.out.println("남은 일정은 다음과 같습니다.");
		
		switch(now) {
			case 9:
				System.out.println("9시에는 출근을 합니다.");
			case 10:
				System.out.println("10시에는 아침 조회를 합니다.");
			case 11:
				System.out.println("11시에는 오전 업무를 시작합니다.");
			case 12:
				System.out.println("12시에는 점심을 먹습니다.");
		}
		/*
		 * case를 실행 후 break가 없어서 다음 case로 넘어간다
		 * break가 있으면 case를 실행하면서 조건을 깨고 나오기 때문에 다음 case를 실행x한다.
		 * now값이 8일경우는 실행되지 않는다.(case에 존재하지 않기 때문에)
		 * case에 있는 값이 수행되고 없는 경우 default문이 있을 경우 실행된다.
		 * java에서는 switch에 문자열도 사용할 수 있다. (다른 프로그램은 숫자만 됨)
		 */
		
		String pos = "대리";
		switch(pos) {
			case "부장":
				System.out.println("부장의 월급은 400만원입니다.");
				break;
			case "과장":
				System.out.println("과장의 월급은 300만원입니다.");
				break;
			case "대리":
				System.out.println("대리의 월급은 200만원입니다.");
			default:
				System.out.println("일반사원의 월급은 150만원입니다.");
		}
//		default밑에 있는 case는 실행되지 않는다.
	}
}
