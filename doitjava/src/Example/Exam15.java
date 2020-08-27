package Example;

import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요? ");
		int line = scan.nextInt();
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<line; j++) {
				if(j<line-i-1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
					
		} scan.close();
	}
}
