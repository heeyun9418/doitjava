package Arsterisk;

public class Arsterisk05 {
	public static void main(String[] args) {
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print(i + 1);
				}
			} System.out.println(); //내가 만든 식
		}
//		for (int i = 4; i >= 0; i--) {
//			for (int j = 0; j <= i; j++) {
//				if (i == j) {
//					System.out.print(i + 1);
//				} else {
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println();
//		}
	}
}
