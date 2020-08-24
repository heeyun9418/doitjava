package Chapter04;

public class ContinueEx {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello!" + i);
			if(i == 1) {
//				break;	//i값이 1과 같을 때 for문을 break한다 (if문은 break할 수 없기 때문에)
				continue;	//i가 1과 같을 경우 현재실행 중인 것을 중단하고 증감식으로 넘어간다.
			}
			System.out.println("출력..");
		}
		
		int cnt = 0;
		while(true) {
			System.out.println("while" + cnt++);	//cnt를 증가시키지 않으면 무한반복된다.
			if(cnt == 5) {
//				break;
				continue;	//4를 출력후 5가 되었기 때문에 조건식으로 넘어간다
			}
			System.out.println("출력..");
			if(cnt == 10) {
				break;
			}
		}
	}
}
