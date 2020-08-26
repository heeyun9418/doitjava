package Example;
 	//1~50까지 합의 평균 -25.5
public class Exam09 {
	public static void main(String[] args) {
		int sum = 0;
			
		for(int i = 1; i<=50; i++) {
			sum += i;
		} 
		double res = sum / 50.0;
		System.out.println(res);
	} //(double)sum으로 강제형변환 후 /50을 해주거나 sum을 50.0으로 나눠준다
}
