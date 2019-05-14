package Java8Example.MapAndFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMapExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Integer> input=new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);

		List<Integer> listOfIntegers = input.stream()
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println("mapped list:"+listOfIntegers);

		List<Integer> evens = Arrays.asList(2, 4, 6); 
		List<Integer> odds = Arrays.asList(3, 5, 7);
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11); 
		List<?> numbers = Stream.of(evens, odds, primes) 
				.flatMap(list -> list.stream()) 
				.collect(Collectors.toList()); 
		System.out.println("flattend list: " + numbers);




	}
}
