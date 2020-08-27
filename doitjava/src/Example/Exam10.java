package Example;

import java.util.Scanner;

//1~7까지 $갯수를 차례로 증가하여 나타나도록 프로그래밍 하시오
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요?");
		int line = scan.nextInt();
		for(int i=0; i<line; i++) {
			for(int j=0; j<i+1; j++) {	//j<=i로 해도 같은 결과가 나온다
				System.out.print("$");
			} 
			System.out.println();
		} scan.close();
	}
}
