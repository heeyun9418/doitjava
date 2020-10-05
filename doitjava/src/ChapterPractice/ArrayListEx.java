package ChapterPractice;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> pitches = new ArrayList<Integer>();
		pitches.add(123);
		pitches.add(456);
		pitches.add(789);
		System.out.println(pitches);
		System.out.println(pitches.get(1));
		System.out.println(pitches.contains(123));
		System.out.println(pitches.size());
		System.out.println();

		pitches.add(0, 321);
		System.out.println(pitches);
		System.out.println(pitches.get(1));
		System.out.println(pitches.contains(123));
		System.out.println(pitches.size());
		System.out.println();

		pitches.remove(1);
		System.out.println(pitches);
		System.out.println(pitches.get(1));
		System.out.println(pitches.contains(123));
		System.out.println(pitches.size());
		System.out.println();

		pitches.remove((Integer) 456); // Integer로 형변환을 해줘야한다
		System.out.println(pitches);
		System.out.println(pitches.get(1));
		System.out.println(pitches.contains(123));
		System.out.println(pitches.size());
	}
}
