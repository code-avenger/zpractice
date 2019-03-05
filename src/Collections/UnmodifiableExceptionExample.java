package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnmodifiableExceptionExample {
	public static void main(String[] args) {
		// create array list
		List<Character> list = new ArrayList<Character>();

		// populate the list
		list.add('X');
		list.add('Y');

		System.out.println("Initial list: " + list);
		System.out.println();

		Collection<Character> immutablelist = Collections.unmodifiableCollection(list);

		// try to modify the list
		immutablelist.add('Z');
	}
}
