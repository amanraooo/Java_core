package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitDemo {
	     Stream.iterate(1,n->n+1)
			.limit(5)
      .forEach(System.out::println);
}
