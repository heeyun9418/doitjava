package ChapterPractice;
/*
 * 메트로폴리스의 조건
 * 1. 수도이고 인구가 100만이상
 * 2. 부자 인구가 50만이상
 * 1,2 둘 중 하나를 만족할 경우 메트로폴리스다
 */
public class MetroCity {
	public static void main(String[] args) {
		boolean isCapital = false;
		int citizens = 0;
		int riches = 0;
		boolean isMetro = false;
		
		System.out.println("현재 도시는 메트로폴리스입니까?");
		isCapital = false;
		citizens = 150;	//만 단위
		riches = 70;
		
		
//		<중첩 if문>
//		if(isCapital) {
//			if(citizens >= 100) {
//				isMetro = true;
//			} else if(riches >= 50) {
//				isMetro = true;
//			}
//		} else {
//			if(riches >= 50) {
//				isMetro = true;
//			}
//		}
//		
//		<논리연산자>
//		if(isCapital && citizens >= 100 ) {
//			isMetro = true;
//		} else if(riches >= 50) {
//			isMetro = true;
//		} else {
//			isMetro = false;
//		}
		
		isMetro = (isCapital && citizens >= 100) || (riches >= 50) ? true : false;
		
		System.out.println("수도여부 : " + isCapital);
		System.out.println("인구수 : " + citizens + " 만명");
		System.out.println("부자수 : " + riches + " 만명");
		System.out.println(isMetro ? "메트로폴리스입니다." : "메트로폴리스가 아닙니다.");
	}
}
