package chapter02;

public class Variable {

	public static void main(String[] args) {
		int level = 10; //���� ������ �����ϰ� ���� 10�� �����Ͽ����ϴ�
		int hp; //������ ���� ������ �� ���� �����ص� �ȴ�
		System.out.println("���� ������ ���ΰ���?"); //���ڿ��� ""�� ���ΰ� ȭ�鿡 �״�� ��µ˴ϴ�
		System.out.println(level); //�������� �Է��ϸ� ������ ����� ���� ��µ˴ϴ�
		System.out.println("���� ü�� �������� ���ΰ���?");
		hp = 500;
		System.out.println(hp);
		System.out.println("�����κ��� 100�� �������� �Ծ����ϴ�");
		hp = 400; //�ѹ� ������ ������ �ٽ� ������ �� ����
		System.out.println("���� ü�� �������� ���ΰ���?");
		System.out.println(hp); //������ ���� �ٲ㼭 ��� ����� �� �ִ�
	}

}