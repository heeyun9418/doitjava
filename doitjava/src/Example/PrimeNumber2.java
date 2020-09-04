package Example;

public class PrimeNumber2 {
	public static void main(String[] args) {

	int cnt=0;

    for(int i=2; i<=100; i++) {
    	for(int j=2; j<=i; j++) {
    		if(i%j == 0) {  
            	 	cnt++;
            }    
        } // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
    	if(cnt == 1) {
             System.out.print(i+" ");
        } cnt=0;
    }

	}
}
