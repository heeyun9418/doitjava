package Chapter04;

public class SwitchCase {
	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		switch(ranking) { //맞는 케이스가 있는 경우 실행, 틀릴 경우 다음 케이스를 실행한다.
			case 1 : 
				medalColor = 'G';
				break;
			case 2 : 
				medalColor = 'S';
				break;
			case 3 : 
				medalColor = 'B';
				break;
			default :
				medalColor = 'A';
				break; //default가 실행된 이후 다른 실행문이 없기 때문에 break생략 ㄱㄴ하다.
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
		
		if(ranking == 1) {
			medalColor = 'G';
		} else if (ranking == 2) {
			medalColor = 'S';
		} else if (ranking == 3) {
			medalColor = 'B';
		} else {
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
	}
}
