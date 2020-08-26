package Example;

import java.util.Scanner;

	//숫자1개를 읽어 짝/홀을 판별하세요
public class Exam02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num1 = scan.nextInt();
		System.out.println(num1 % 2 == 0 ? "짝수" : "홀수");
		
		if (num1 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		if (num1 % 2 == 0) System.out.println("짝수랑께");
		else System.out.println("홀수랑께");
		
		String str = "";
		if (num1%2==0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println(str); //str은 제시된 답
		
		scan.close();
	}
}
