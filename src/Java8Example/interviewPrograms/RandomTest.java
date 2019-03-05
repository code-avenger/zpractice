package Java8Example.interviewPrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		System.out.println();
		random.doubles().limit(5).forEach(n -> System.out.println(new BigDecimal(n).setScale(2, RoundingMode.CEILING)));
	}
}
