package ChapterPractice;

public class For {
	public static void main(String[] args) {
		int[] score = { 90, 58, 65, 84, 43 };

		for (int i = 0; i < score.length; i++) {
			if (score[i] > 60) {
				System.out.println(score[i] + "���� �հ��Դϴ�");
			} else {
				System.out.println(score[i] + "���� ���հ��Դϴ�");
			}
		}
		System.out.println();

		for (int i = 0; i < score.length; i++) {
			if (score[i] < 60) {
				continue;
			}
			System.out.println((i + 1) + "�� �л� �����մϴ�. �հ��Դϴ�.");
		}
	}
}
