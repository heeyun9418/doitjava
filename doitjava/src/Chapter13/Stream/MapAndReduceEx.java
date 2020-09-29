package Chapter13.Stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10), 
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
				);

		double avg = studentList.stream()
				// �߰�ó��(�л� ��ü�� ������ ����)
				.mapToInt(Student::getScore)
				// ���� ó��(��� ����)
				.average().getAsDouble();
		
		System.out.println("��� ����: " + avg);
	}
}
