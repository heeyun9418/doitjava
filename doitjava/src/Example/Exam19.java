package Example;

import java.util.Scanner;

public class Exam19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int line;
		do {
			System.out.print("몇 줄을 출력하시겠습니까?(홀수만 입력): ");
			line = scan.nextInt();
		} while (line % 2 == 0);
		int upline = line / 2;
		int downline = line - upline;
		
		for (int i = 0; i < upline; i++) {
			System.out.print(" ");
			for (int j = 0; j < upline; j++) {
				if (j < upline - i - 1) {
					System.out.print(" ");
				} else {
					if (j == upline - i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			for (int j = 0; j < i; j++) {
				if (j == i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
			for (int i = downline - 1; i >= 0; i--) {
				for (int j = 0; j < downline; j++) {
					if (j < downline - i - 1) {
						System.out.print(" ");
					} else {
						if (j == downline - i - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
				for (int j = 0; j < i; j++) {
					if (j == i-1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
								
		}
	}
}
