package Example;

public class PrimeNumber2 {
	public static void main(String[] args) {

	int cnt=0;

    for(int i=2; i<=100; i++) {
    	for(int j=2; j<=i; j++) {
    		if(i%j == 0) {  
            	 	cnt++;
            }    
        } // �Ҽ��� 1�� �ڱ��ڽ����θ� �������Ƿ� �ڱ��ڽ����� �ѹ��� �������� �Ҽ�
    	if(cnt == 1) {
             System.out.print(i+" ");
        } cnt=0;
    }

	}
}
