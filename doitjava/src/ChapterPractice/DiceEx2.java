package ChapterPractice;

public class DiceEx2 {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6) + 1;	//����(������ ��)�� ��µȴ�. 
		System.out.println(dice);
		switch(dice) {
			case 1 : dice = 1;
				break;
			case 2 : dice = 2;
				break;
			case 3 : dice = 3;
				break;
			case 4 : dice = 4;
				break;
			case 5 : dice = 5;
				break;
			case 6 : dice = 6;
		}
		System.out.println("�ֻ����� ������ " + dice + "�Դϴ�.");			
			
	}
}


/*
 * Math.random �� 0 <= Math.random < 1 �� ���� �����ϰ� ���´�
 * 
 * 0 <= Math.random < 1
 * 0 * 6 + 1 <= Math.random * 6 + 1 < 1 * 6 + 1
 */
