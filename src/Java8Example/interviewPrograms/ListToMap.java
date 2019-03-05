package Java8Example.interviewPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class ListToMap {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 3, 5, 7, 6, 8);

		Map<Integer, Integer> map = list.stream().collect(
				Collectors.toMap(i -> i, i -> i));

		System.out.println(map.toString());
	}
}
