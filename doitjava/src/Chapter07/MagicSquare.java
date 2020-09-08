package Chapter07;

import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int square[][];
		int val = 1;
		int n = 0;
		int half;
		int quater;

		System.out.print("짝수 숫자만 입력 (예: 4, 8, 12, 16...) :");
		n = scan.nextInt();

		square = new int[n][n];
		half = n / 2;
		quater = half / 2;

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (a(row, col, half, quater) == true) {
					square[row][col] = val;
				} else {
					square[row][col] = n * n - val + 1;
				}
				val++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean a(int row, int col, int half, int quater) {
		if (row < quater || row >= half + quater) {
			if (col < quater || col >= half + quater) {
				return true;
			}
		}
		if (row >= quater && row < half + quater) {
			if (col >= quater && col < half + quater) {
				return true;
			}
		}
		return false;
	}
}
