package Chapter05;

public class CompanyTest {
	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1 == c2);	//같은 객체를 return해줬으므로 true값이 나온다
	}
}
