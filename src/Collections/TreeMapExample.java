package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {

		// TreeMap<Integer, String> treeMap = new TreeMap<>();
		//
		// treeMap.put(11, "eleven");
		// treeMap.put(9, "nine");
		// treeMap.put(2, "two");
		// treeMap.put(4, "four");

		// System.out.println(treeMap);

		// for (Entry<Integer, String> k : treeMap.entrySet()) {
		// System.out.println(k.getValue());
		// }

		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(11, "eleven");
		hashMap.put(9, "nine");
		hashMap.put(2, "two");
		hashMap.put(4, "four");

		System.out.println("hashMap " + hashMap);
		TreeMap<Integer, String> treeMap1 = new TreeMap<>(hashMap);
		System.out.println("treeMap1 " + treeMap1);
	}
}
