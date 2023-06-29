package day22.stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public abstract class StreamEx {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> arrStream = Arrays.stream(arr);
		Stream<Integer> listStream = list.stream();
		
		//전체 출력
		arrStream.forEach(num->System.out.println(num));
		System.out.println("==============");
		listStream.forEach(num->System.out.println(num));
		System.out.println("==============");
		
		//3보다 큰 수
		arrStream = Arrays.stream(arr);
		arrStream
			.filter(num -> num > 3)
			.forEach(num -> System.out.println(num));
		System.out.println("==============");
		listStream = list.stream();
		listStream
			.filter(num -> num > 3)
			.forEach(num -> System.out.println(num));
	}

}
