package Chapter04;

public class ForEx2 {
	public static void main(String[] args) {
		int i = 0;
		
		for(i = 0; i < 10; i ++) {	//조건식의 숫자만큼 반복된다.
			System.out.println("안녕하세요!" + i);
		}
		
		System.out.println(i);	
		
		
//		for(int i = 0; i < 15; i ++) {	
//			System.out.println("안녕하세요!" + i);
//		}
//		
//		System.out.println(i);
		/*
		 * for문에서 i값을 선언한 경우 {}사이에서 이미 i의 사용이 끝났기 때문에
		 * 메모리에서 i값이 삭제되었기 때문에 for문 다음에 i값을 출력할 수 없다.
		 * 다시 출력을 원할 경우 i값은 for문 외부에 만들어줘야 한다.
		 */
		
	}
}
