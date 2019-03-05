package Java8Example.interviewPrograms;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementInStream {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 5, 8, 7, 9);

		int result = list.stream().filter(n -> n > 5).findAny().get();

		System.out.println(result);
	}
}
