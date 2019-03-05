package Java8Example.interviewPrograms;

import java.util.stream.Stream;

public class ForEachOrdered {
	public static void main(String[] args) {
		Stream.of("AAA", "BBB", "CCC").parallel().forEach(s -> System.out.println("Output:" + s));
		System.out.println();
		System.out.println("Below output will always be same.");
		Stream.of("AAA", "BBB", "CCC").parallel().forEachOrdered(s -> System.out.println("Output:" + s));

		// The second line will always output
		//
		// Output:AAA
		// Output:BBB
		// Output:CCC
	}
}
