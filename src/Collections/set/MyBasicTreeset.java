package Collections.set;

import java.util.TreeSet;

public class MyBasicTreeset {

	public static void main(String a[]) {

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(3);
		ts.add(1);
		ts.add(2);
		System.out.println("Elements: " + ts);

		// check is set empty?
		System.out.println("Is set empty: " + ts.isEmpty());

		// delete all elements from set
		ts.clear();
		System.out.println("Is set empty: " + ts.isEmpty());

		ts.add(1);
		ts.add(4);
		ts.add(2);
		ts.add(4);
		ts.add(3);
		System.out.println("Size of the set: " + ts.size());

		// remove one string
		ts.remove(2);
		System.out.println("Elements: " + ts);

		ts.iterator().forEachRemaining(x -> {
			System.out.println(x);
		});
	}
}
