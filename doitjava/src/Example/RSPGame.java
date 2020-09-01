package Example;

import java.util.Scanner;

public class RSPGame {
	public static void main(String[] args) {
		final int SCISSOR = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		int score = 0;
		int life = 3;
		int user, com;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다.");
		while (true) {
			com = (int)(Math.random()*3);
			System.out.println("0: 바위, 1: 가위, 2: 보");
			System.out.print(">");
			user = sc.nextInt(); //0,1,2 외의 값은 재입력하도록
				
		/*결과값 출력*/
		System.out.println("컴퓨터 : "+ (com == 0 ? "바위" : (com == 1 ? "가위" : "보")));
		System.out.println("유저 : " + (user == 0 ? "바위" : (user == 1 ? "가위" : "보")));
		
			if((com==SCISSOR && user==ROCK) || (com==ROCK && user==PAPER) || (com==PAPER && user==SCISSOR)) {
				 System.out.println("이겼습니다.");
				 score += 100;
			} else if (com == user) {
				System.out.println("비겼습니다.");
				score += 10;
			} else  {
				System.out.println("졌습니다.");
				life--;
			} 
			/*현재 점수와 남은 목숨 출력*/
			System.out.println("현재점수 : " + score);
			System.out.println("남은 라이프 : " + life);
			
			/*남은 목숨이 0이되면 게임종료*/
			if (life == 0) {
				System.out.println("life가 0이 되어 게임을 종료합니다.");
				sc.close();
				break;
			}
			System.out.println();
		}
	}
}
