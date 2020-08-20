package ChapterPractice;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		int iNum;
		Scanner scan = new Scanner(System.in);	//스캐너생성코드 - 변수명만 변경 ㄱㄴ(여기서 scan)
												//외부에서 데이터를 받도록 채널을 열어둔 것이다.
		
//		System.out.println("정수를 입력해주세요:");
//		System.out.print("> ");
//		iNum = scan.nextInt();
//		System.out.println("입력한 정수: " + iNum);
//		System.out.println();
//		System.out.println("실수를 입력해 주세요: ");
//		double dNum = scan.nextDouble();
//		System.out.println("입력한 실수: " + dNum);
//		System.out.println();
//		System.out.println("실수(f)를 입력해 주세요: ");
//		float fNum = scan.nextFloat();
//		System.out.print("입력한 실수(f): " + fNum);
		System.out.println("문자열을 입력해 주세요: ");
//		String str = scan.next();	//문자열 입력에는 next() 사용하지만 공백은 넣을 수 없다.
//									//스캐너에서 공백은 다음값 입력을 의미한다.
//		System.out.println("입력한 문자열 :" + str);
//		str = scan.next();
//		System.out.println("입력한 문자열: " + str);
//		str = scan.next();
//		System.out.println("입력한 문자열: " + str);

		String str = scan.nextLine();	//한 줄 입력 명령어로 공백도 입력 가능하다.
		System.out.println("입력한 문자열: " + str);
		
		scan.close();	//스캐너는 더 이상 사용하지 않을 경우 닫아줘야 한다.
	}
}
