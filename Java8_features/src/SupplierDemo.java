import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> s = () -> "Java 8";

		System.out.println(s.get());
	}
}