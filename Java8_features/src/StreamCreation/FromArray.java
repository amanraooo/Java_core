package StreamCreation;

import java.util.Arrays;
import java.util.List;

public class FromArray {
	List<Integer> list = Arrays.asList(10,20,30);

        list.stream()
		.forEach(System.out::println);
}
