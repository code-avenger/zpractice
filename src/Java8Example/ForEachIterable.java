package Java8Example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ForEachIterable {
	public static void main(String[] args) {

		System.out.println("JAVA VERSION: " + System.getProperty("java.version"));

		List<String> names = new LinkedList<>();

		names.add("Ram");
		names.add("Rahim");
		names.add("Robert");

		names.forEach(name -> System.out.println(name));


		Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));

	}
}
