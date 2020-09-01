package Example;

import java.util.Random;
import java.util.Scanner;

public class RSPGame2 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	String[] str = new String[] {"묵", "찌", "빠"}; // 서로 선택한게 뭔지 출력해주기 위해
	int user, com;
	
		while(true) {
			System.out.println("1. 묵, 2. 찌, 3. 빠, 0. 종료");
			System.out.print("숫자를 입력해주세요 ");
			
			user = scan.nextInt(); // 유저 선택
			if(user < 0 || 3 < user) { // 수를 잘 못 선택했다면
				System.out.println("잘 못 선택하셨습니다.\n");
				continue;
			}
			if(user == 0) { // 0을 선택했을시 프로그램 종료
				System.out.println("종료합니다.\n");
				break;
			}
			
			com = rand.nextInt(2)+1; // 컴퓨터 선택(난수발생)

			if(user == com) { // 서로 같은 것을 선택하셨을 시..
				System.out.println("당신은 " + str[user-1] + "컴퓨터는 " + str[com-1]);
				System.out.println("서로 비겼습니다.\n");
			}
			else if(user==3 && com==1) { // 유저가 빠, 컴퓨터가 묵 선택시..
				System.out.println("당신은 " + str[user-1] +  "컴퓨터는 " + str[com-1]);
				System.out.println("당신이 이겼습니다.\n");
			}
			else if(user < com) { // 유저 묵, 컴퓨터 찌 or 유저 찌, 컴퓨터 빠 선택시
				System.out.println("당신은 " + str[user-1] +  "컴퓨터는 " + str[com-1]);
						System.out.println("당신이 이겼습니다.\n");
			}
			else { // 그외 유저가 졌을 시..
				System.out.println("당신은 " + str[user-1] + "컴퓨터는 " + str[com-1]);
				System.out.println("당신이 졌습니다.\n");
			}
		
		}
	}
}
