package ChapterPractice;

public class InsertRetrun {

	public static void main(String[] args) {
		Test myTest = new Test();
		int c = myTest.sum(3, 4);
		System.out.println(c);

		Test myTest2 = new Test();
		String a = myTest2.say();
		System.out.println(a);
	}

	public void sum2(int a, int b) {
		System.out.println(a + "�� " + b + "�� ���� " + (a + b) + "�Դϴ�.");
	}

	public void say() {
		System.out.println("Hi");
	}
}
