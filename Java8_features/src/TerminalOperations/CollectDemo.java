package TerminalOperations;

public class CollectDemo {

	List<Integer> even =
			Arrays.asList(10,15,20,25,30)
					.stream()
					.filter(n -> n%2==0)
					.collect(Collectors.toList());

    System.out.println(even);
}
