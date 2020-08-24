package Chapter04;

import java.util.Scanner;

public class DoWhileEx {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
				System.out.print("> ");
				inputString = scan.nextLine();	//한줄을 가져오는 것, 공백도 허용된다.
				System.out.println(inputString);
		} while (!inputString.equals("q"));	//값이 같은지 equals로 확인한다
		System.out.println();
		System.out.println("프로그램 종료");
		scan.close();	//scan은 사용후 닫아줘야한다.
	}
}
