package Chapter05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {	//void�� return���ش� 
		System.out.println(studentName + "," + address);
	}
}
