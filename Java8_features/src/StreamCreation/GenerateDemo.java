package StreamCreation;

import java.util.stream.Stream;

public class GenerateDemo {
Stream.generate(() -> "Hello")
		.limit(3)
      .forEach(System.out::println);
}
