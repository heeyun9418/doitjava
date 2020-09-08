package Chapter07;

public class ArrayEx07 {
	public static void main(String[] args) {
		int[][] arr = { 
					{ 10, 20 }, 
					{ 30, 40 }, 
					{ 50, 60, 70 } 
				};
		for (int i = 0; i < arr.length; i++)
		{// i<3°ú °°´Ù
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
		}
		System.out.println();
		}
	}
}
