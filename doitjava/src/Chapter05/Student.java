package Chapter05;

public class Student {
	/* �ʵ� - ������� */
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* ������ - ��ü�� ������ �� �����ϴ� ��� */
	Student(int num1, long num2) { 
		System.out.println("Student ��ü�� �����մϴ�");
	}	
	Student(int num3, int num4) { 
		System.out.println("Student ��ü�� �����մϴ�");
	}	
	Student(long num3, int num4) { //�Ű������� Ÿ���� �ٸ��� ����� �� �ְ�, �Է¹޴� ������ ���� �޶����� 
		System.out.println("Student ��ü�� �����մϴ�");
	}	
	Student(int num) { //�Ű������� ���� ������, Ŭ������ �̸��� �����ؾ� �Ѵ�
		System.out.println("Student ��ü�� �����մϴ�" + num);
	}	
	Student(long num) { //�����̸��� ������ ���°� �ٸ����� ���ȴ�
		System.out.println("Student ��ü�� �����մϴ�" + num);
	}	
	Student() { //�Ű������� ���� ������, Ŭ������ �̸��� �����ؾ� �Ѵ�
		System.out.println("����Ʈ �����ڷ� Student ��ü�� �����մϴ�" );
	}	//����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������
	
	/* �޼ҵ� - ����Լ� */
	public void showStudentInfo() {	//void�� return���ش� 
		System.out.println(studentName + "," + address);
	}
}
//����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������
//Student () {} //����Ʈ ������ : �����ڸ� ������� ������ �ڵ����� ����