package Chapter05;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {	//void로 return해준다 
		System.out.println(studentName + "," + address);
	}
}
