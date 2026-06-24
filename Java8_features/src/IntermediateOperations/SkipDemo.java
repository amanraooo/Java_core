package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class SkipDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);

		list.stream()
				.skip(2)
				.forEach(System.out::println);
	}

}
