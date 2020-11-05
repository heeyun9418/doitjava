package ChapterPractice;

public class For {
	public static void main(String[] args) {
		int[] score = { 90, 58, 65, 84, 43 };

		for (int i = 0; i < score.length; i++) {
			if (score[i] > 60) {
				System.out.println(score[i] + "점은 합격입니다");
			} else {
				System.out.println(score[i] + "점은 불합격입니다");
			}
		}
		System.out.println();

		for (int i = 0; i < score.length; i++) {
			if (score[i] < 60) {
				continue;
			}
			System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다.");
		}
	}
}
