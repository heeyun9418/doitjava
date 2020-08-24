package Chapter04;

public class DoWhile {
	public static void main(String[] args) {
		int num = 20;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		num = 20;
		sum = 0;
		while(num <= 10) {
			sum += num++;
		}
		System.out.println(sum);
		/*
		 * 두 구문은 위에서부터 아래로 수행하기 때문에 위에서 수행된 num의 값이 20 이기때문에
		 * 아래쪽 while문에서는 수행을 하지 않는다
		 */
	}
}

