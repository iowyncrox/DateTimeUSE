import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateTime {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period p = Period.ofMonths(1);
		performAnimalEnrichment(start, end);
		System.out.println("");
		performAnimalEnrichment(start, end, p);
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1);
		}
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end,
			Period period) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}
}