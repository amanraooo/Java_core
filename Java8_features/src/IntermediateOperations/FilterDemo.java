package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,20,25,30);

		list.stream()
				.filter(n -> n % 2 == 0)
				.forEach(System.out::println);
	}

}
