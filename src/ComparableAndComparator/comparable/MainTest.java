package ComparableAndComparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {

		List<Employ> list = new ArrayList<Employ>();
		list.add(new Employ("1", "zohaib"));
		list.add(new Employ("3", "rahim"));
		list.add(new Employ("2", "Borbon"));


		Collections.sort(list,(x,y)->x.getName().compareTo(y.getName()));
		
		System.out.println(list);
	}
}
