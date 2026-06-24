package StreamCreation;

import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {
		Stream.of("A","B","C")
				.forEach(System.out::println);
	}

}
