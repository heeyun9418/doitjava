package Example;

import java.util.HashSet;
import java.util.Set;

public class Exam20 {
	public static void main(String[] args) {
		int num = 0;
		Set<Integer> set = new HashSet<>();
		while(set.size() < 6) {
			num = (int)(Math.random() * 45)+1;
			set.add(num);
		}
		System.out.println("lottery number making");
		for(int n:set) {
			System.out.print(n + " ");
		}
	}
}
