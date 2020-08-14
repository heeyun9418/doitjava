package Chapter03;

public class UnaryOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		int c = 100, d = 200, e = 300; //같은 타입은 한 줄에 선언과 초기화(대입) 할 수 있다
		
		System.out.println("a++ = " + a++ + ", ++b = " + (++b)); 
		//()부터 연산하기 때문에 헷갈릴 경우 우선순위에 ()를 쳐준다
		System.out.println("a = " + a + ", b = " + b);
		
		c++; //100
		c++; //101
		c++; //102
		System.out.println(c++); //103
		//104
		System.out.println(c); //104
		
		++c; //105
		c++; //105
		++c; //107
		++c; //108
		++c; //109
		c++; //109
		System.out.println(++c); //111
		
		/*
		 * ++문자는 전위 연산자로 문자에 미리 1을 더해준다
		 * 문자++은 후위 연산자로 문자 다음 연산에 1을 더해준다
		 * 위에 연습처럼 전위+후위의 경우 원래는 2가 더해진 값이 나와야 하지만
		 * 후위 연산자의 경우 다음번에 1을 더하기 때문에 전위+후위의 값은 +1만큼 나온다
		 * ++는 1증가, --는 1감소이다
		 */
		
		
	}

}
