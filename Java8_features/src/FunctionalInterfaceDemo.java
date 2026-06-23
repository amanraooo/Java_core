@FunctionalInterface
interface Square {
	int square(int n);
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {

		Square s = x -> x * x;

		System.out.println(s.square(5));
	}
}