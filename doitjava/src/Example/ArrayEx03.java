package Example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		// 5���� ������ �Է¹޾� �迭�� �ְ� �Է¹��� �� �� max/min�� ���

		int[] arr = new int[5];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		scan.close();
		
//		Arrays.sort(arr); // sort�� ������������ ���ĵȴ�
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//
//		System.out.println("Max: " + arr[arr.length - 1]);
//		System.out.println("Min: " + arr[0]);
		

		
		
//		int[] arr = new int[] { 26, 53, 5, 8, 97 };
//		int max = arr[0];
//		int min = arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println("max: "+ max + " min: " + min);
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
	
	}
}
