package Java8Example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.OptBoolean;

public class StreamExampleTerminal {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();

		myList.add(2);
		myList.add(3);
		myList.add(5);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.add(3);
		myList.add(5);

		//	toArray() collect() count()	reduce() forEach() forEachOrdered()	min()	max()	
		// anyMatch()	allMatch()	noneMatch()
		//	findAny()	findFirst()

		// use of toArray()
		Object[] arr=myList.stream().toArray();
		System.out.println("arr: "+Arrays.toString(arr));

		//use of collect() with collectors.toList. also we can use toSet, toMap and many more 
		Set<Integer> list=myList.stream().collect(Collectors.toSet());

		System.out.println("count(): "+myList.stream().count());

		// use of reduce to get smallest element
		Optional<Integer> opt= myList.stream().reduce((a,b)->(a<b)?a:b);
		opt.ifPresent(System.out::println);

		//use of min() which returns optional of int
		System.out.println("min(): "+myList.stream().min((a,b)->a.compareTo(b)));

		//use of max() which returns optional of int
		System.out.println("max(): "+myList.stream().max((a,b)->a.compareTo(b)));


		//use of anyMatch, allMathc, noneMatch. Returns boolean
		Predicate<Integer> predicate=a-> (a>7);
		System.out.println("anyMatch(): "+myList.stream().anyMatch(predicate));
		System.out.println("allMatch(): "+myList.stream().allMatch(predicate));
		System.out.println("noneMathc(): "+myList.stream().noneMatch(predicate));
		
		//findFirst(), findAny() = this will find any one element and returns
		System.out.println("findFirst(): "+myList.stream().findFirst());
		System.out.println("findAny(): "+myList.stream().findAny());
		

	}

}
