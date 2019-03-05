package Java8Example.interviewPrograms;

import java.util.Arrays;
import java.util.List;

public class GetAverage {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 3, 2, 5, 4, 1, 3);

		Double average = list.stream().mapToInt(i -> i).average().getAsDouble();

		System.out.println(average);
	}
}
