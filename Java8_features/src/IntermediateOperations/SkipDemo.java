package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class SkipDemo {
	List<Integer> list = Arrays.asList(10,20,30,40,50);

     list.stream()
		.skip(2)
    .forEach(System.out::println);
}
