package Example;

import java.util.Scanner;

public class HighLowGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com = (int) (Math.random() * 100) + 1;
		int user = 0;
		int cnt = 0;

		System.out.println("숫자 맞추기 게임을 시작합니다.");
		System.out.println("1 ~ 100 중 랜덤생성된 숫자를 맞추세요.");

		while (true) {
			System.out.print("> ");
			user = scan.nextInt();
			System.out.println(++cnt + "회 입력하셨습니다.");

			if (user > com) {
				System.out.print("입력한 숫자보다 작습니다.");
			} else if (user < com) {
				System.out.print("입력한 숫자보다 큽니다.");
			} else {
				System.out.print("정답입니다. 게임을 종료합니다.");
				scan.close();
				break;
			}
		}
	}
}
