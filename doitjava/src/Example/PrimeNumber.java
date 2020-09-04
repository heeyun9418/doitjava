package Example;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
			boolean PrimeNumber = true;

			for (int i=2; i<num; i++) {
				if(num%i==0) {
					PrimeNumber = false;
				}
			}

			if (PrimeNumber) {
			System.out.println("입력한 숫자 "+ num + "은(는) 소수입니다.");

			} else {
			System.out.println("입력한 숫자 "+ num + "은(는) 소수가 아닙니다");			
			} scan.close();
	}
}
