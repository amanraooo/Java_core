package StreamCreation;

import java.util.stream.Stream;

public class IterateDemo {
	public static void main(String[] args) {
		Stream.generate(() -> "Hello")
				.limit(3)
				.forEach(System.out::println);
	}

}
