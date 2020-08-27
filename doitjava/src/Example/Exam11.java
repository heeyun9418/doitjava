package Example;

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요?");
		int line = scan.nextInt();
		for(int i=line-1; i>=0; i--) {	//외부에 있는 for문을 감소식으로 바꿔준다//j<=i로 해도 같은 결과가 나온다
			for(int j=0; j<=i; j++) {
				System.out.print("$");
			}
			System.out.println();
		} scan.close();
		
//		for(int i=9; i>=0; i--) {
//			System.out.println(i);
		}
	}

