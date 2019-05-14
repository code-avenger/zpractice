package Collections.concurrent;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {
	ConcurrentNavigableMap<String, String> concurrentSkipListMap = new ConcurrentSkipListMap<String, String>();
	concurrentSkipListMap.put("3", "Apple");
	concurrentSkipListMap.put("2", "Ball");
	concurrentSkipListMap.put("1", "Car");
	concurrentSkipListMap.put("5", "Doll");
	concurrentSkipListMap.put("4", "Elephant");

	// Returns a key-value mapping associated with the least key greater than or
	// equal to the given key, or null if there is no such key.
	System.out.println("ceilingEntry-2: " + concurrentSkipListMap.ceilingEntry("2"));

	NavigableSet<String> navigableSet = concurrentSkipListMap.descendingKeySet();
	System.out.println("descendingKeySet: ");
	// Iterator<String> itr = navigableSet.iterator();
	// while (itr.hasNext()) {
	// String s = itr.next();
	// System.out.println(s);
	// }

	navigableSet.forEach(item -> System.out.println(item));

	System.out.println("firstEntry: " + concurrentSkipListMap.firstEntry());
	System.out.println("lastEntry: " + concurrentSkipListMap.lastEntry());
	System.out.println("pollFirstEntry: " + concurrentSkipListMap.pollFirstEntry());
	System.out.println("now firstEntry: " + concurrentSkipListMap.firstEntry());
	System.out.println("pollLastEntry: " + concurrentSkipListMap.pollLastEntry());
	System.out.println("now lastEntry: " + concurrentSkipListMap.lastEntry());
    }

}