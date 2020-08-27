package Example;

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요? ");
		int line = scan.nextInt();
		for(int i=0; i<line; i++) {	//첫번째줄은 0부터 시작을 한다(짝수줄)
			for(int j=0; j<i+1; j++) {	//j<=i로 해도 같은 결과가 나온다
				if (j % 2 == 0) {
					System.out.print("$");
				} else {
					System.out.print("￦");
				}
			}		
			System.out.println();
		} scan.close();
	}
	
}
