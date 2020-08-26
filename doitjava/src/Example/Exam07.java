package Example;
	//1~50중 3의배수의 개수 -16
public class Exam07 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i=0; i<=50;) {
			if(i % 3 == 0) {
				cnt++;
			}
		} System.out.println(cnt);
	}
}
