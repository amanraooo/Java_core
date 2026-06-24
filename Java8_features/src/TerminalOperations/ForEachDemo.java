package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<List<String>> school = Arrays.asList(
				Arrays.asList("Aman","Rahul"),
				Arrays.asList("Rohit","Mohit")
		);

		school.stream()
				.flatMap(List::stream)
				.forEach(System.out::println);
	}

}
