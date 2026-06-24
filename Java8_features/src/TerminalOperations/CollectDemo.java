package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> even =
				Arrays.asList(10,15,20,25,30)
						.stream()
						.filter(n -> n%2==0)
						.collect(Collectors.toList());

		System.out.println(even);
	}

}
