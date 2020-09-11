package Chapter05;

public class Student {
	/* 필드 - 멤버변수 */
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* 생성자 - 객체를 생성할 때 실행하는 블록 */
	Student(int num1, long num2) { 
		System.out.println("Student 객체를 생성합니다");
	}	
	Student(int num3, int num4) { 
		System.out.println("Student 객체를 생성합니다");
	}	
	Student(long num3, int num4) { //매개변수의 타입이 다르면 사용할 수 있고, 입력받는 순서에 따라 달라진다 
		System.out.println("Student 객체를 생성합니다");
	}	
	Student(int num) { //매개변수가 없는 생성자, 클래스의 이름과 동일해야 한다
		System.out.println("Student 객체를 생성합니다" + num);
	}	
	Student(long num) { //같은이름의 변수라도 형태가 다른것은 허용된다
		System.out.println("Student 객체를 생성합니다" + num);
	}	
	Student() { //매개변수가 없는 생성자, 클래스의 이름과 동일해야 한다
		System.out.println("디폴트 생성자로 Student 객체를 생성합니다" );
	}	//디폴트 생성자는 매개변수가 없고 실행 코드가 없는 생성자
	
	/* 메소드 - 멤버함수 */
	public void showStudentInfo() {	//void로 return해준다 
		System.out.println(studentName + "," + address);
	}
}
//디폴트 생성자는 매개변수가 없고 실행 코드가 없는 생성자
//Student () {} //디폴트 생성자 : 생성자를 명시하지 않으면 자동으로 생성