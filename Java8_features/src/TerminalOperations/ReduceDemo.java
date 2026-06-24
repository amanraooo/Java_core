package TerminalOperations;

import java.util.Arrays;

public class ReduceDemo {
	public static void main(String[] args) {
		int sum = Arrays.asList(10,20,30,40)
				.stream()
				.reduce(0,Integer::sum);

		System.out.println(sum);
	}

}
