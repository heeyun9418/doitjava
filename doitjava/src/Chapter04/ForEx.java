package Chapter04;

public class ForEx {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num < 11) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		int i = 0;	//i=index 주로 횟수를 표현한다.
		int res = 0;
		for(i = 1; i < 11; i = i + 1) {	//초기화는 최초에 한번만 실행됨. 참일 경우에만 반복한다
			res +=
					i;
		}
		System.out.println(res);
	}
}

/*
 * 증감식은 식이 들어가는 공간이다
 * i++ -> i += 1 -> i = i + 1
 */




