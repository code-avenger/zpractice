package Java8Example.interviewPrograms;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 3, 2, 6, 4);

		Integer[] arrList = (Integer[]) list.stream().filter(b -> b > 3)
				.toArray(size -> new Integer[size]);

		// Descending sorted
		Arrays.asList(arrList).stream().sorted((i, j) -> j.compareTo(i))
				.forEach(System.out::println);
	}
}
