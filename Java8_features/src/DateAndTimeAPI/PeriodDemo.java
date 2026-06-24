package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
	public static void main(String[] args) {
		LocalDate birth = LocalDate.of(2005,1,10);

		Period age =
				Period.between(birth, LocalDate.now());

		System.out.println(age.getYears());
	}
}
