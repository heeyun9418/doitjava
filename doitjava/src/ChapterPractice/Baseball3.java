package ChapterPractice;

import java.util.Scanner;

public class Baseball3 {
	public static void main(String[] args) {
		int[] com = new int[3];
		int[] user;
		int cnt = 0;

		System.out.println("숫자 야구 게임");
		System.out.println("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];

		while (cnt == 11) {
			System.out.println(cnt + "번 남았습니다");
			for (int i = 0; i <= com.length; i++) {
				int[] user = sc.nextInt();
				com[i] = (int) (Math.random() * 9) + 1;
				if (i == user[i]) {
					System.out.println("Strike");
				} else {
					System.out.println("Ball");
				}
				cnt--;
			}
		}
	}
}
