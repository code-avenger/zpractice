package Java8Example.interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterExample {
	public static void main(String[] args) { 

		List<String> versions = new ArrayList<>(); 
		versions.add("Lollipop");
		versions.add("KitKat");
		versions.add("Jelly Bean");
		versions.add("Ice Cream Sandwidth");
		versions.add("Honeycomb");
		versions.add("Gingerbread");

		versions.stream().forEach(System.out::println);
		System.out.println();
		versions.forEach(System.out::println);
		System.out.println();

		System.out.println("*********** sorted list: ");
		versions.stream().sorted((s1, s2) -> s1.compareTo(s2))
				.forEach(System.out::println);
		System.out.println();

		// Using one filter() 
		// print all versions whose length is greater than 10 character 
		System.out.println("All versions whose length greater than 10"); 
		versions.stream() .filter(s -> s.length() > 10) .forEach(System.out::println); 
		System.out.println();

		System.out.println("first element which has letter 'e' "); 
		String first = versions.stream().filter(s -> s.contains("e"))
				.findFirst().get();
		System.out.println(first); 
		System.out.println();

		// Using multiple filter 
		System.out.println("Element whose length is > 5 and startswith G"); 
		versions.stream() .filter(s -> s.length() > 8) .filter(s -> s.startsWith("G")) .forEach(System.out::println); 
		System.out.println();

		// another example of filter() method in Java 8 
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18); 
		Integer lcm = listOfNumbers.stream() .filter(i -> i % 2 == 0) .filter(i -> i % 3 == 0) .findFirst().get(); 
		System.out.println("first number divisible by 2 and 3 in the list is : " + lcm); 
	} 
}



