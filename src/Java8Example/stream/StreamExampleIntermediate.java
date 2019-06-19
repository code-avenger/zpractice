package Java8Example.stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class StreamExampleIntermediate {

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

		
		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		Stream<Integer> highNums = parallelStream.filter(p -> p > 7);
		highNums.forEach(p -> System.out.println("High Nums parallel=" + p));

		// sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		// using lambda with Stream API, filter example, map, forEach
		Stream<Integer> filterMapSeq = sequentialStream.filter(p -> p > 7);
		// using lambda in forEach
		filterMapSeq.forEach(p -> System.out.println("High Nums sequential=" + p));

		//Using map, distinct, sorted with comparator, limit, foreach
		myList.stream().map(x->x*2).distinct().sorted((a,b)->b.compareTo(a)).limit(5).forEach(p->System.out.println("M: "+p));

		//peek
		myList.stream().peek(k->System.out.println("K: "+k));

		//skip = skips first 3 elements of the list
		myList.stream().skip(3).forEach(n->System.out.println("n: "+n));


		//IntSummaryStatistics to get max, min, average, sum, count etc from list of integers
		IntSummaryStatistics sumStats=myList.stream().mapToInt(x->x).summaryStatistics();
		System.out.println("max of the list is: "+sumStats.getMax());



	}

}
