package Chapter10;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA(); // interfaceA�� methodA�� ���డ��
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB(); // interfaceB�� methodB�� ���డ��
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA(); // interfaceC�� ��� ���డ��
		ic.methodB();
		ic.methodC();
	}
}
