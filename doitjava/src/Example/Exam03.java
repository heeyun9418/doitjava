package Example;
	//1~10까지의 합을 구하세요
public class Exam03 {
	public static void main(String[] args) {
		int i;
		int sum;
		
		for(i = 1, sum = 0; i<=10; i++) {
			sum += i;
		}				
		System.out.println("숫자의 합은 " + sum + "입니다.");
		
		int sum2 = 0;
		for (int i2=1; i2<=10; i2++) {
			sum2 += i2;
		}
		System.out.println("1부터 10까지의 합은 "+sum2+"입니다.");
	}
}
