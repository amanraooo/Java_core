package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class SortedDemo {

	List<Integer> list = Arrays.asList(40,10,30,20);

    list.stream()
		.sorted()
    .forEach(System.out::println);
}
