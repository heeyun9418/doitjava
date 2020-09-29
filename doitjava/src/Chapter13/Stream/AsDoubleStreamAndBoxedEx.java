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
			.boxed()	// Integer타입을 사용하는 스트림으로 변환됨
			.forEach(obj -> System.out.println(obj.intValue()));
	}
}
