package Example;
	//1~100까지 출력 , 3의배수는 ping, 5의 배수는 pong을 출력하시오
public class Pingpong {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i + " PingPong");
			} else if (i % 5 == 0) {
				System.out.println(i + " Pong");
			} else if (i % 3 == 0) {
				System.out.println(i + " Ping");
			} else {
				System.out.println(i);
			}
		} System.out.println();
//		if구문에서 이미 참/거짓이 판별된 숫자는 버리고 다음 else if/els 구문으로
//		넘어가기 때문에 공배수 값을 먼저 판별해야한다
		
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if(i % 3 == 0) {
				System.out.print("Ping");
			}
			if(i % 5 == 0) {
				System.out.print("Pong");
			}
			System.out.println();
		}
	}
}
