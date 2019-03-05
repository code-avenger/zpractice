package Java8Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionApiChanges {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			intList.add(i);
		}
		
		Iterator<Integer> ite=intList.iterator();
		System.out.println("forEachReamining use : ");
		ite.forEachRemaining(p -> System.out.print(p + " "));
	}
}
