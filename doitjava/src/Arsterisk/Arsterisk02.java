package Arsterisk;

public class Arsterisk02 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {	//첫번째 조건이 j<i일 경우 i=j=0이므로 *을 출력하지 않는다.
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
