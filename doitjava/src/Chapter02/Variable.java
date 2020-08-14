package Chapter02;

public class Variable {

	public static void main(String[] args) {
		int level = 10; //레벨 변수를 선언하고 정수 10을 저장하였습니다
		int hp; //변수를 먼저 선언한 후 값을 대입해도 된다
		System.out.println("현재 레벨은 얼마인가요?"); //문자열은 ""로 감싸고 화면에 그대로 출력됩니다
		System.out.println(level); //변수명을 입력하면 변수에 저장된 값이 출력됩니다
		System.out.println("현재 체력 게이지는 얼마인가요?");
		hp = 500;
		System.out.println(hp);
		System.out.println("적으로부터 100의 데미지를 입었습니다");
		hp = 400; //한번 선언한 변수는 다시 선언할 수 없다
		System.out.println("현재 체력 게이지는 얼마인가요?");
		System.out.println(hp); //변수는 값을 바꿔서 계속 사용할 수 있다
	}

}
