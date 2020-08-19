package Chapter04;

public class IfEx {

	public static void main(String[] args) {
		int score = 83;

		if (score >= 90) { // 조건문이나 반복문을 사용할 때는 {}로 수행할 문장을 묶어준다.
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		} else {	//else문은 if문에서 false일 경우 실행되는 영역이다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

//		if (score < 90)
//			System.out.println("점수가 90보다 작습니다.");
//		System.out.println("등급은 B입니다.");
		/*
		 *  {}를 하지 않을 경우 한 줄만 실행이 된다.
		 *  ctrl+shift+f하면 자동정렬 해준다.
		 *  "등급~B"의 경우 if문에 포함되지 않으므로 같은 정렬에 포함되지 않는다.
		 *  그래서 false인 "90보다 작다"는 실행되지 않는다(if문에 포함이므로)
		 *  if는 조건식이 true일 경우 else는 조건식이 false일 경우 실행된다.
		 */


		System.out.println("false인 if문은 실행되지 않습니다.");
	}

}
