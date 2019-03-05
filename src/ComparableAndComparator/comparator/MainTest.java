package ComparableAndComparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MainTest {
	public static void main(String[] args) {

		List<Employ> list = new ArrayList<Employ>();
		list.add(new Employ("1", "zohaib"));
		list.add(new Employ("3", "rahim"));
		list.add(new Employ("2", "Borbon"));

		list.sort((Employ e1, Employ e2) -> e1.getId().compareTo(e2.getId()));

		System.out.println(list);

		// list.sort((Employ e1, Employ e2) -> e1.getName().compareTo(e2.getName()));

		list.forEach(e -> System.out.println(e.toString()));

		System.out.println("After sort:");
		Collections.sort(list, new CompareToTest());
		//list.forEach(e -> System.out.println(e.toString()));
		
		list.forEach(System.out::println);

	}
}
