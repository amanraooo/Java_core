package StreamCreation;

import java.util.stream.Stream;

public class IterateDemo {
Stream.generate(() -> "Hello")
		.limit(3)
      .forEach(System.out::println);
}
