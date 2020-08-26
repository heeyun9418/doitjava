package Example;
	
import java.util.Scanner;

	//입력한 정수가 같다면 same 다르다면 different를 출력하세요
public class Exam01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력해 주세요: ");
		int num1 = scan.nextInt();
		System.out.println("두 번째 정수를 입력해 주세요: ");
		int num2 = scan.nextInt();
		
		if (num1 == num2) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		if(num1 == num2) System.out.println("Same2");
		else System.out.println("Different2");
		
		System.out.println(num1 == num2 ? "Same3" : "Different3");
		//가장 좋은 방법이다(삼항연산자)
		//구문을 사용하는 것보다 연산으로 표현하는게 빨리 출력된다.
		
		scan.close();
	}
}
