package Example;
	//1~10까지의 수를 곱하시오
public class Exam06 {
	public static void main(String[] args) {
		int multi = 1;
		 for(int i=1; i<=10; i++) {
			 multi *= i;
		 }
		 System.out.println("1부터 10까지의 수들의 곱은" +multi+ "이다.");
		 //결과값에는 ""를 붙이지 않는다.
	}
}
