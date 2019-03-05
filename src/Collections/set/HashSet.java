package Collections.set;

import java.util.Iterator;

public class HashSet {
	public static void main(String[] args) {
		java.util.HashSet<String> hSet = new java.util.HashSet<>();

		hSet.add("hi");
		hSet.add(null);
		hSet.add("hi");
		hSet.add("hi2");
		hSet.add("hi3");
		hSet.add("hi4");

		hSet.add("hi2");
		System.out.println("************************");
		
		Iterator<String> it = hSet.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
		
		System.out.println("************************");
		
		hSet.iterator().forEachRemaining(x->{
			System.out.println(x);
		});
		
		System.out.println("************************");
		
		System.out.println(hSet);

		/*
		 * List<Integer> list = new ArrayList<>(); list.add(23); //
		 * list.add(null); list.add(46); // list.add(null); list.add(46);
		 * list.add(1);
		 * 
		 * ListIterator<Integer> lt = list.listIterator(); while (lt.hasNext())
		 * {
		 * 
		 * System.out.println(lt.next());
		 * 
		 * }
		 */

		/*
		 * System.out.println(list);
		 * 
		 * Collections.reverse(list); System.out.println(list);
		 * 
		 * System.out.println(Collections.max(list));
		 * 
		 * System.out.println(list.stream().map(e -> e > 40)
		 * .collect(Collectors.toList()));
		 */
	}
}
