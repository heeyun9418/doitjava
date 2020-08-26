package Example;
	//1~50까지의 수 중에 3의 배수의 합계를 구하시오 -408
	//n의 배수값은 숫자를 n으로 나눴을 때 나머지가 0이면 n의 배수이다.
public class Exam05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++)
			if(i % 3 == 0) {
				sum += i;				
			}
			System.out.println("1부터 50까지의 수 중에서 3의 배수의 합은 "+sum+"입니다.");
	}
}
