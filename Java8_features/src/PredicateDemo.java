import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> even = n -> n % 2 == 0;

		System.out.println(even.test(10));
		System.out.println(even.test(11));
	}
}