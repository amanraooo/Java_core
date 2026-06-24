package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class SortedDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(40,10,30,20);

		list.stream()
				.sorted()
				.forEach(System.out::println);
	}

}
