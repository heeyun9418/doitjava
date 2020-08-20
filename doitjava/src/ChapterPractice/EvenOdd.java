package ChapterPractice;

import java.util.Scanner;

/*
 * 숫자를 입력 받아서 입력받은 숫자가 홀/짝인지 출력하세요.
 */
public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		System.out.print("> ");
		
		Scanner scan = new Scanner(System.in);
		int evenNum = scan.nextInt();
				
			if(evenNum % 2 == 0) {
				System.out.println("입력한 숫자는 짝수입니다.");
			} else {
				System.out.println("입력한 숫자는 홀수입니다.");
			}
		scan.close();
	}
}
