package Chapter04;

public class ForEx3 {
	public static void main(String[] args) {
		int i, j;
		for(i = 0; i < 3; i++) {
			for(i = 0; i < 5; i++) {	
				System.out.print("*");	
			}
			System.out.println();
		} //	i가 중첩문 내에서 값이 5가 되었기 때문에
		  //		위로 올라가서 i의 값이 3보다 크기 때문에 실행되지 않는다.
		
		for(i = 0; i < 3; i++) {
			System.out.println("hello!");
		}	//서로다른 for문에서는 i값을 써도 되지만 내부에서는 같은 i를 쓸 수 없다.
	}
}
