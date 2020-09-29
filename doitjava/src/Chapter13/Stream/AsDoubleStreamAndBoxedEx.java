package Chapter13.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedEx {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(intArray); // IntStream intStream = IntStream.of(intArray);
		intStream
			.asDoubleStream()
			.forEach(d -> System.out.println(d));
		System.out.println();

		intStream = Arrays.stream(intArray);
		intStream
			.boxed()	// IntegerŸ���� ����ϴ� ��Ʈ������ ��ȯ��
			.forEach(obj -> System.out.println(obj.intValue()));
	}
}
