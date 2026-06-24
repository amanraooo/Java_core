package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class LimitDemo {
	List<Integer> list = Arrays.asList(10,20,10,30,20);

     list.stream()
		.distinct()
    .forEach(System.out::println);
}
