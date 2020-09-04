package ChapterPractice;

public class OverFlow {
	public static void main(String[] args) {
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		
		int iNum = Integer.MIN_VALUE;
		System.out.println(iNum);
		iNum--;
		System.out.println(iNum);
		
	}//표현범위를 넘어서면 제일 아래로 내려간다. (순환한다)
}
