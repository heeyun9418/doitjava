package Example;

public class Continue01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
//				System.out.print("나머지가 없는 숫자: ");
//				break;	//반복문을 멈춘다(if에서 빠져나와 바로 위에있는 for문을 멈춘다)
				continue;	//if문에 부합할 때 현재실행문을 멈추고 증감식으로 넘어간다.
			}
			System.out.println(i);
		}
	}
}
